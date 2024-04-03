package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entidades.CategoriaJuego;
import entidades.Producto;
import repository.ProductoRepository;
import service.interfaces.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto obtenerProductoPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        // Aquí puedes realizar validaciones u otras operaciones de negocio antes de guardar el producto
        return productoRepository.save(producto);
    }

    @Override
    public void eliminarProductoPorId(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public List<Producto> buscarProductosPorNombre(String nombre) {
        return productoRepository.findByNombre(nombre);
    }
    
    @Override
    public List<Producto> buscarProductosPorCategoria(CategoriaJuego categoria) {
        // Aquí puedes realizar validaciones u otras operaciones de negocio antes de guardar el producto
        return productoRepository.findByCategoria(categoria);
    }

    @Override
    public long cantidadProductosPorCategoria(CategoriaJuego categoria) {
    	return productoRepository.countByCategoria(categoria);
    }

    @Override
    public void eliminarProductosPorCategoria(CategoriaJuego categoria) {
        productoRepository.deleteByCategoria(categoria);
    }

}
