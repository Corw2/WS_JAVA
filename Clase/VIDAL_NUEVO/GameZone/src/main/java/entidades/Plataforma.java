package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

import java.sql.Date;
import java.util.Objects;

@Entity
public class Plataforma {
	
    @Id
    @Column(name="ID_PLATAFORMA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlataforma;
    
    @Column(name="NOMBRE")
    private String nombre;
    
    @Column(name="DESCRIPCION")
    private Date descripcion;

	public Long getIdPlataforma() {
		return idPlataforma;
	}

	public void setIdPlataforma(Long idPlataforma) {
		this.idPlataforma = idPlataforma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(Date descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descripcion, idPlataforma, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plataforma other = (Plataforma) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(idPlataforma, other.idPlataforma)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Plataforma [idPlataforma=" + idPlataforma + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", getIdPlataforma()=" + getIdPlataforma() + ", getNombre()=" + getNombre() + ", getDescripcion()="
				+ getDescripcion() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
   
    
}
