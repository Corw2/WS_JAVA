package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Objects;

import javax.persistence.Column;

@Entity
public class Cliente {
	
    @Id
    @Column(name="ID_CLIENTE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    
    @Column(name="NOMBRE")
    private String nombre;
    
    @Column(name="APELLIDOS")
    private String apellidos;
    
    @Column(name="EMAIL")
    private String email;
    
    @Column(name="DIRECCION")
    private String direccion;
    
    @Column(name="TELEFONO")
    private String telefono;

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, direccion, email, idCliente, nombre, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(email, other.email) && Objects.equals(idCliente, other.idCliente)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(telefono, other.telefono);
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email="
				+ email + ", direccion=" + direccion + ", telefono=" + telefono + ", getIdCliente()=" + getIdCliente()
				+ ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getEmail()=" + getEmail()
				+ ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}  
    

}
