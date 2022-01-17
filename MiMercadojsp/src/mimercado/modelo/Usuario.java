package mimercado.modelo;

public class Usuario {
	
	private Integer id;
	private String cedula ;
	private String correo ;
	private String password ;
	private String nombre;
	private String apellido ;
	private String celular;
	private String confirmarPassword ;
	
	public Usuario() {
		super();
	}

	public Usuario(Integer id) {
		super();
		this.id = id;
	}

	public Usuario(String cedula, String correo, String password, String nombre, String apellido, String celular
			) {
		super();
		this.cedula = cedula;
		this.correo = correo;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
		
	}

	public Usuario(Integer id, String cedula, String correo, String password, String nombre, String apellido,
			String celular, String confirmarPassword) {
		super();
		this.id = id;
		this.cedula = cedula;
		this.correo = correo;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
		this.confirmarPassword = confirmarPassword;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getConfirmarPassword() {
		return confirmarPassword;
	}

	public void setConfirmarPassword(String confirmarPassword) {
		this.confirmarPassword = confirmarPassword;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", cedula=" + cedula + ", correo=" + correo + ", password=" + password
				+ ", nombre=" + nombre + ", apellido=" + apellido + ", celular=" + celular + ", confirmarPassword="
				+ confirmarPassword + "]";
	}
	
	
	

}
