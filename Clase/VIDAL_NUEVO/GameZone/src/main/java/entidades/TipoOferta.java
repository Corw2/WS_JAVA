package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

import java.sql.Date;
import java.util.Objects;

@Entity
public class TipoOferta {
	
    @Id
    @Column(name="ID_TIPO_OFERTA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoOferta;
    
    @Column(name="NOMBRE")
    private String nombre;
    
    @Column(name="DESCRIPCION")
    private Date descripcion;

	public Long getIdTipoOferta() {
		return idTipoOferta;
	}

	public void setIdTipoOferta(Long idTipoOferta) {
		this.idTipoOferta = idTipoOferta;
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
		return Objects.hash(descripcion, idTipoOferta, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoOferta other = (TipoOferta) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(idTipoOferta, other.idTipoOferta)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "TipoOferta [idTipoOferta=" + idTipoOferta + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", getIdTipoOferta()=" + getIdTipoOferta() + ", getNombre()=" + getNombre() + ", getDescripcion()="
				+ getDescripcion() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
    
    
}
