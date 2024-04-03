package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;

@Entity
public class Transaccion {
	
    @Id
    @Column(name="ID_TIPO_PRODUCTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransaccion;
    
    @Column(name="ID_PEDIDO")
    private Long idPedido;
    
    @Column(name="ID_METODO_PAGO")
    private Long idMetodoPago;
    
    @Column(name="FECHA")
    private Date fecha;
    
    @Column(name="MONTO")
    private Double monto;
    
	public Long getIdTransaccion() {
		return idTransaccion;
	}
	public void setIdTransaccion(Long idTransaccion) {
		this.idTransaccion = idTransaccion;
	}
	
	public Long getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}
	
	public Long getIdMetodoPago() {
		return idMetodoPago;
	}
	public void setIdMetodoPago(Long idMetodoPago) {
		this.idMetodoPago = idMetodoPago;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	@Override
	public int hashCode() {
		return Objects.hash(fecha, idMetodoPago, idPedido, idTransaccion, monto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaccion other = (Transaccion) obj;
		return Objects.equals(fecha, other.fecha) && Objects.equals(idMetodoPago, other.idMetodoPago)
				&& Objects.equals(idPedido, other.idPedido) && Objects.equals(idTransaccion, other.idTransaccion)
				&& Objects.equals(monto, other.monto);
	}
	@Override
	public String toString() {
		return "Transaccion [idTransaccion=" + idTransaccion + ", idPedido=" + idPedido + ", idMetodoPago="
				+ idMetodoPago + ", fecha=" + fecha + ", monto=" + monto + "]";
	}   

    
}
