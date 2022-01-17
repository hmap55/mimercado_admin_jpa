package mimercado.modelo;

public class Producto {
	
	private Integer id;
	private String nombre;
	private Integer precio;
	private Integer inventario;
	private String url;
	private String seccion;
	private String promocion;
	
	public Producto() {
		super();
	}

	public Producto(Integer id, String nombre, Integer precio, Integer inventario, String url, String seccion,
			String promocion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.inventario = inventario;
		this.url = url;
		this.seccion = seccion;
		this.promocion = promocion;
	}
	
	

	public Producto(String nombre, Integer precio, Integer inventario, String url, String seccion, String promocion) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.inventario = inventario;
		this.url = url;
		this.seccion = seccion;
		this.promocion = promocion;
	}
	
	

	public Producto(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getInventario() {
		return inventario;
	}

	public void setInventario(Integer inventario) {
		this.inventario = inventario;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getPromocion() {
		return promocion;
	}

	public void setPromocion(String promocion) {
		this.promocion = promocion;
	}
	
	
	
	
	

}
