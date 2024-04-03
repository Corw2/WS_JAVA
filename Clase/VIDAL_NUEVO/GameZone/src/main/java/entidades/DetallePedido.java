package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Objects;

import javax.persistence.Column;

@Entity
public class DetallePedido {
	
    @Id
    @Column(name="ID_DETALLE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetalle;
    
    @Column(name="ID_PEDIDO")
    private Long idPedido;
    
    @Column(name="ID_PRODUCTO")
    private Long idProducto;
    
    @Column(name="CANTIDAD")
    private int cantidad;
    
    @Column(name="PRECIO_UNITARIO")
    private double precioUnitario;

	public Long getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(Long idDetalle) {
		this.idDetalle = idDetalle;
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
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

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidad, idDetalle, idPedido, idProducto, precioUnitario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetallePedido other = (DetallePedido) obj;
		return cantidad == other.cantidad && Objects.equals(idDetalle, other.idDetalle)
				&& Objects.equals(idPedido, other.idPedido) && Objects.equals(idProducto, other.idProducto)
				&& Double.doubleToLongBits(precioUnitario) == Double.doubleToLongBits(other.precioUnitario);
	}

	@Override
	public String toString() {
		return "DetallePedido [idDetalle=" + idDetalle + ", idPedido=" + idPedido + ", idProducto=" + idProducto
				+ ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", getIdDetalle()=" + getIdDetalle()
				+ ", getIdPedido()=" + getIdPedido() + ", getIdProducto()=" + getIdProducto() + ", getCantidad()="
				+ getCantidad() + ", getPrecioUnitario()=" + getPrecioUnitario() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
     
    
}
