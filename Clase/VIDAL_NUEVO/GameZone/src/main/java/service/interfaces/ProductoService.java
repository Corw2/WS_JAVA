package service.interfaces;

import java.util.List;

import entidades.CategoriaJuego;
import entidades.Producto;

public interface ProductoService {
	
    List<Producto> obtenerTodosLosProductos();
    
    Producto obtenerProductoPorId(Long id);
    
    Producto guardarProducto(Producto producto);
    
    void eliminarProductoPorId(Long id);
    
    List<Producto> buscarProductosPorNombre(String nombre);
    
    public List<Producto> buscarProductosPorCategoria(CategoriaJuego categoria);
    
    public long cantidadProductosPorCategoria(CategoriaJuego categoria);
    
    public void eliminarProductosPorCategoria(CategoriaJuego categoria);
	
}
