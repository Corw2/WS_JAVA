package controller;

import entidades.Producto;
import service.interfaces.ProductoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;


//POSIBLE LLAMADO AL metodo del controller desde la vista principal
//<a href="${pageContext.request.contextPath}/productos/${producto.id}">Ver Producto</a>


@Controller
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/productos")
    public String mostrarTodosLosProductos(Model model) {
        List<Producto> productos = productoService.obtenerTodosLosProductos();
        model.addAttribute("productos", productos);
        return "listaProductos"; // Vista que muestra la lista de productos
    }

    @PostMapping("/producto/{id}")
    public String mostrarDetalleProducto(@PathVariable Long id, Model model) {
        Producto producto = productoService.obtenerProductoPorId(id);
        model.addAttribute("producto", producto);
        return "productos"; // Vista que muestra los detalles de un producto
    }
}
