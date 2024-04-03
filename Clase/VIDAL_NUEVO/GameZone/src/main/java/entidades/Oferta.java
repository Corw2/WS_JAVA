package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;

@Entity
public class Oferta {
	
    @Id
    @Column(name="ID_OFERTA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOferta;
    
    @Column(name="ID_PRODUCTO")
    private Long idProducto;
    
    @Column(name="ID_TIPO_OFERTA")
    private Long idTipoOferta;
    
    @Column(name="FECHA_NICIO")
    private Date fechaInicio;
    
    @Column(name="FECHA_FIN")
    private Date fechaFin;
    
    @Column(name="DESCUENTO")
    private double descuento;

	@Override
	public int hashCode() {
		return Objects.hash(descuento, fechaFin, fechaInicio, idOferta, idProducto, idTipoOferta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oferta other = (Oferta) obj;
		return Double.doubleToLongBits(descuento) == Double.doubleToLongBits(other.descuento)
				&& Objects.equals(fechaFin, other.fechaFin) && Objects.equals(fechaInicio, other.fechaInicio)
				&& Objects.equals(idOferta, other.idOferta) && Objects.equals(idProducto, other.idProducto)
				&& Objects.equals(idTipoOferta, other.idTipoOferta);
	}

	@Override
	public String toString() {
		return "Oferta [idOferta=" + idOferta + ", idProducto=" + idProducto + ", idTipoOferta=" + idTipoOferta
				+ ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", descuento=" + descuento
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}

    
}
