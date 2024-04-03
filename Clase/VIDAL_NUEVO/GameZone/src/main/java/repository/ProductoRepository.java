package repository;

import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entidades.CategoriaJuego;
import entidades.Producto;

@Repository
public interface ProductoRepository { //extends JpaRepository<Producto, Long>
	
	Producto findById(Long id);
	
    List<Producto> findByNombre(String nombre);
    
    List<Producto> findByPrecioLessThan(double precio);
    
	List<Producto> findAll();
	
	Producto save(Producto producto);
	
	void deleteById(Long id);
	
    List<Producto> findByCategoria(CategoriaJuego categoria);
    
    long countByCategoria(CategoriaJuego categoria);
    
    void deleteByCategoria(CategoriaJuego categoria);
	
}
