package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Objects;

import javax.persistence.Column;


@Entity
public class LoginCliente {
	
    @Id
    @Column(name="ID_LOGIN")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLogin;
    
    @Column(name="ID_CLIENTE")
    private Long idCliente;
    
    @Column(name="PASSWORD")
    private String password;

	public Long getIdLogin() {
		return idLogin;
	}

	public void setIdLogin(Long idLogin) {
		this.idLogin = idLogin;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCliente, idLogin, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginCliente other = (LoginCliente) obj;
		return Objects.equals(idCliente, other.idCliente) && Objects.equals(idLogin, other.idLogin)
				&& Objects.equals(password, other.password);
	}

	@Override
	public String toString() {
		return "LoginCliente [idLogin=" + idLogin + ", idCliente=" + idCliente + ", password=" + password
				+ ", getIdLogin()=" + getIdLogin() + ", getIdCliente()=" + getIdCliente() + ", getPassword()="
				+ getPassword() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
    
    
}
