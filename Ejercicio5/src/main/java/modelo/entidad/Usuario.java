package modelo.entidad;

public class Usuario {
	private String usuario;
	private String password;
	
	public Usuario(String usuario, String password) {
		this.usuario = usuario;
		this.password = password;
	}
	
	public Usuario() {
		super();
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return "Usuario [usuario=" + usuario + ", password=" + password + "]";
	}
	
	
}
