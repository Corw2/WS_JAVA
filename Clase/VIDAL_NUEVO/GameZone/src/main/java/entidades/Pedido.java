package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

import java.sql.Date;
import java.util.Objects;

@Entity
public class Pedido {
    @Id
    @Column(name="ID_PEDIDO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;
    
    @Column(name="ID_CLIENTE")
    private Long idCliente;
    
    @Column(name="FECHA_PEDIDO")
    private Date fechaPedido;
    
    @Column(name="ID_ESTADO")
    private Long idEstado;
    
    @Column(name="TOTAL")
    private double total;

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaPedido, idCliente, idEstado, idPedido, total);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(fechaPedido, other.fechaPedido) && Objects.equals(idCliente, other.idCliente)
				&& Objects.equals(idEstado, other.idEstado) && Objects.equals(idPedido, other.idPedido)
				&& Double.doubleToLongBits(total) == Double.doubleToLongBits(other.total);
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", idCliente=" + idCliente + ", fechaPedido=" + fechaPedido
				+ ", idEstado=" + idEstado + ", total=" + total + ", getIdPedido()=" + getIdPedido()
				+ ", getIdCliente()=" + getIdCliente() + ", getFechaPedido()=" + getFechaPedido() + ", getIdEstado()="
				+ getIdEstado() + ", getTotal()=" + getTotal() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}   

    
}
