package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import org.json.simple.JSONObject;
import com.google.gson.JsonObject;

import conn.ConexionBD;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CargarProductoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
		
		doPost(request, response);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
		System.out.println("Hola Servlet");
		
        response.setContentType("text/html");
        //PrintWriter out = response.getWriter();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        String idProducto = request.getParameter("id_producto");
        System.out.println("idProducto "+idProducto);
        try {
            // Establecer conexión con la base de datos
            connection = ConexionBD.getConnection();
            
            // Consulta para obtener los datos del producto
            String query = "SELECT * FROM producto WHERE id_producto = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, Integer.parseInt(idProducto)); // Aquí asume que el ID del producto es 1, cambia según sea necesario
            resultSet = preparedStatement.executeQuery();
            

            JsonObject productoJson = new JsonObject();
            
            // Procesar los resultados de la consulta
            if (resultSet.next()) {
                // Obtener los valores de nombre y precio
            	Float valoracion = resultSet.getFloat("valoracion");
                String nombre = resultSet.getString("nombre");
                String precio = resultSet.getString("precio");
                String ruta = resultSet.getString("ruta_imagen");
                
                // Generamos un objeto JSON con los datos del producto     
                productoJson.addProperty("valoracion", valoracion);
                productoJson.addProperty("nombre", nombre);
                productoJson.addProperty("precio", precio);
                productoJson.addProperty("ruta_imagen", ruta);
                
                //productoJson.put("precio", precio);

                // Enviamos el objeto JSON como respuesta
                response.setContentType("application/json");
                PrintWriter out = response.getWriter();
                out.print(productoJson.toString());
                out.flush();
            } else {
            	productoJson.addProperty("valoracion", "");
                productoJson.addProperty("nombre", "");
                productoJson.addProperty("precio", "");
                productoJson.addProperty("ruta_imagen", "");
                
                // Enviamos el objeto JSON como respuesta
                response.setContentType("application/json");
                PrintWriter out = response.getWriter();
                out.print(productoJson.toString());
                out.flush();
            }

//            request.getRequestDispatcher("/jsp/productos.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
