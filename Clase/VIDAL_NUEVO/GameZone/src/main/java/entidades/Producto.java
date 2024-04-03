package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Objects;

import javax.persistence.Column;

@Entity
public class Producto {
	
    @Id
    @Column(name="ID_PLATAFORMA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;
    
    @Column(name="NOMBRE")
    private String nombre;
    
    @Column(name="DESCRIPCION")
    private String descripcion;
    
    @Column(name="ID_PLATAFORMA")
    private Long idPlataforma;
    
    @Column(name="ID_TIPO_PRODUCTO")
    private Long idTipoProducto;
    
    @Column(name="PRECIO")
    private double precio;
    
    @Column(name="RUTA_IMAGEN")
    private String rutaImagen;
    
    @Column(name="STOCK")
    private int stock;
    
    @Column(name="ID_CATEGORIA")
    private Long idCategoria;
    
    @Column(name="VALORACION")
    private int valoracion;
    
    @Column(name="RUTA_SNAPSHOTS")
    private String rutaSnapshots;

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getIdPlataforma() {
		return idPlataforma;
	}

	public void setIdPlataforma(Long idPlataforma) {
		this.idPlataforma = idPlataforma;
	}

	public Long getIdTipoProducto() {
		return idTipoProducto;
	}

	public void setIdTipoProducto(Long idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getRutaImagen() {
		return rutaImagen;
	}

	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public String getRutaSnapshots() {
		return rutaSnapshots;
	}

	public void setRutaSnapshots(String rutaSnapshots) {
		this.rutaSnapshots = rutaSnapshots;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descripcion, idCategoria, idPlataforma, idProducto, idTipoProducto, nombre, precio,
				rutaImagen, rutaSnapshots, stock, valoracion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(idCategoria, other.idCategoria)
				&& Objects.equals(idPlataforma, other.idPlataforma) && Objects.equals(idProducto, other.idProducto)
				&& Objects.equals(idTipoProducto, other.idTipoProducto) && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio)
				&& Objects.equals(rutaImagen, other.rutaImagen) && Objects.equals(rutaSnapshots, other.rutaSnapshots)
				&& stock == other.stock && valoracion == other.valoracion;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", idPlataforma=" + idPlataforma + ", idTipoProducto=" + idTipoProducto + ", precio=" + precio
				+ ", rutaImagen=" + rutaImagen + ", stock=" + stock + ", idCategoria=" + idCategoria + ", valoracion="
				+ valoracion + ", rutaSnapshots=" + rutaSnapshots + "]";
	}

	public Producto orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

    
}
