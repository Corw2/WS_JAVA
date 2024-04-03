package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class CategoriaJuego {
	
    @Id
    @Column(name="ID_CATEGORIA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;
    
    @Column(name="NOMBRE")
    private String nombre;
    
    @Column(name="DESCRIPCION")
    private String descripcion;

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
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

	@Override
	public int hashCode() {
		return Objects.hash(descripcion, idCategoria, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoriaJuego other = (CategoriaJuego) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(idCategoria, other.idCategoria)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "CategoriaJuego [idCategoria=" + idCategoria + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", getIdCategoria()=" + getIdCategoria() + ", getNombre()=" + getNombre() + ", getDescripcion()="
				+ getDescripcion() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
    
    

}
