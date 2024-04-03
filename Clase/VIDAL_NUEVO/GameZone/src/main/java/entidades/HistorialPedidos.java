package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

import java.sql.Date;
import java.util.Objects;



@Entity
public class HistorialPedidos {
	
    @Id
    @Column(name="ID_HISTORIAL_PEDIDO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHistorialPedido;
    
    @Column(name="ID_PEDIDO")
    private Long idPedido;
    
    @Column(name="ID_CLIENTE")
    private Long idCliente;
    
    @Column(name="FECHA_HORA")
    private Date fechaHora;
    
    @Column(name="ESTADO")
    private String estado;

	public Long getIdHistorialPedido() {
		return idHistorialPedido;
	}

	public void setIdHistorialPedido(Long idHistorialPedido) {
		this.idHistorialPedido = idHistorialPedido;
	}

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

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(estado, fechaHora, idCliente, idHistorialPedido, idPedido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HistorialPedidos other = (HistorialPedidos) obj;
		return Objects.equals(estado, other.estado) && Objects.equals(fechaHora, other.fechaHora)
				&& Objects.equals(idCliente, other.idCliente)
				&& Objects.equals(idHistorialPedido, other.idHistorialPedido)
				&& Objects.equals(idPedido, other.idPedido);
	}

	@Override
	public String toString() {
		return "HistorialPedidos [idHistorialPedido=" + idHistorialPedido + ", idPedido=" + idPedido + ", idCliente="
				+ idCliente + ", fechaHora=" + fechaHora + ", estado=" + estado + ", getIdHistorialPedido()="
				+ getIdHistorialPedido() + ", getIdPedido()=" + getIdPedido() + ", getIdCliente()=" + getIdCliente()
				+ ", getFechaHora()=" + getFechaHora() + ", getEstado()=" + getEstado() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
    
    
}
