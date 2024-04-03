package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

import java.sql.Date;
import java.util.Objects;

@Entity
public class StatsProducto {
	
    @Id
    @Column(name="ID_STAT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStat;
    
    @Column(name="ID_PRODUCTO")
    private Long idProducto;
    
    @Column(name="CANTIDAD")
    private int cantidad;
    
    @Column(name="FECHA")
    private Date fecha;

	public Long getIdStat() {
		return idStat;
	}

	public void setIdStat(Long idStat) {
		this.idStat = idStat;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidad, fecha, idProducto, idStat);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatsProducto other = (StatsProducto) obj;
		return cantidad == other.cantidad && Objects.equals(fecha, other.fecha)
				&& Objects.equals(idProducto, other.idProducto) && Objects.equals(idStat, other.idStat);
	}

	@Override
	public String toString() {
		return "StatsProducto [idStat=" + idStat + ", idProducto=" + idProducto + ", cantidad=" + cantidad + ", fecha="
				+ fecha + ", getIdStat()=" + getIdStat() + ", getIdProducto()=" + getIdProducto() + ", getCantidad()="
				+ getCantidad() + ", getFecha()=" + getFecha() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
   

}
