package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.sql.Date;
import java.util.Objects;

@Entity
public class TipoProducto {
	
    @Id
    @Column(name="ID_TIPO_PRODUCTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoProducto;
    
    @Column(name="NOMBRE")
    private String nombre;
    
    @Column(name="DESCRIPCION")
    private Date descripcion;

	public Long getIdTipoProducto() {
		return idTipoProducto;
	}

	public void setIdTipoProducto(Long idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
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
		return Objects.hash(descripcion, idTipoProducto, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoProducto other = (TipoProducto) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(idTipoProducto, other.idTipoProducto)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "TipoProducto [idTipoProducto=" + idTipoProducto + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", getIdTipoProducto()=" + getIdTipoProducto() + ", getNombre()=" + getNombre()
				+ ", getDescripcion()=" + getDescripcion() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
   
    

    
}
