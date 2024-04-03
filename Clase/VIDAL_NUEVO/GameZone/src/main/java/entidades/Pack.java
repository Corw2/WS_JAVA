package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Objects;

import javax.persistence.Column;

@Entity
public class Pack {
	
	@Id
	@Column(name="ID_PRODUCTO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;
	
	@Column(name="ID_PRODUCTO_CONTENIDO")
    private Long idProductoContenido;

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Long getIdProductoContenido() {
		return idProductoContenido;
	}

	public void setIdProductoContenido(Long idProductoContenido) {
		this.idProductoContenido = idProductoContenido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idProducto, idProductoContenido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pack other = (Pack) obj;
		return Objects.equals(idProducto, other.idProducto)
				&& Objects.equals(idProductoContenido, other.idProductoContenido);
	}

	@Override
	public String toString() {
		return "Pack [idProducto=" + idProducto + ", idProductoContenido=" + idProductoContenido + ", getIdProducto()="
				+ getIdProducto() + ", getIdProductoContenido()=" + getIdProductoContenido() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	
}
