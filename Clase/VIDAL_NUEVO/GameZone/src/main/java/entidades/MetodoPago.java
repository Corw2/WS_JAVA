package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Objects;

import javax.persistence.Column;

@Entity
public class MetodoPago {
	
    @Id
    @Column(name="ID_METODO_PAGO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMetodoPago;
    
    @Column(name="NOMBRE")
    private String nombre;
    
    @Column(name="DESCRIPCION")
    private String descripcion;

	public Long getIdMetodoPago() {
		return idMetodoPago;
	}

	public void setIdMetodoPago(Long idMetodoPago) {
		this.idMetodoPago = idMetodoPago;
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
		return Objects.hash(descripcion, idMetodoPago, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MetodoPago other = (MetodoPago) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(idMetodoPago, other.idMetodoPago)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "MetodoPago [idMetodoPago=" + idMetodoPago + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", getIdMetodoPago()=" + getIdMetodoPago() + ", getNombre()=" + getNombre() + ", getDescripcion()="
				+ getDescripcion() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
  
    
}
