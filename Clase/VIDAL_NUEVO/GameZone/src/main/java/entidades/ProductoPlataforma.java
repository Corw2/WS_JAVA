package entidades;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Objects;

import javax.persistence.Column;

@Entity
public class ProductoPlataforma {
	
	@Id
    @Column(name="ID_PRODUCTO")
    private Long idProducto;
	
    @Id
    @Column(name="ID_PLATAFORMA")
    private Long idPlataforma;

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Long getIdPlataforma() {
		return idPlataforma;
	}

	public void setIdPlataforma(Long idPlataforma) {
		this.idPlataforma = idPlataforma;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPlataforma, idProducto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoPlataforma other = (ProductoPlataforma) obj;
		return Objects.equals(idPlataforma, other.idPlataforma) && Objects.equals(idProducto, other.idProducto);
	}

	@Override
	public String toString() {
		return "ProductoPlataforma [idProducto=" + idProducto + ", idPlataforma=" + idPlataforma + ", getIdProducto()="
				+ getIdProducto() + ", getIdPlataforma()=" + getIdPlataforma() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	
    
}
