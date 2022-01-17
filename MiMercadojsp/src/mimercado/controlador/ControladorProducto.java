package mimercado.controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mimercado.dao.ProductoDao;
import mimercado.modelo.Producto;

/**
 * Servlet implementation class ControladorProducto
 */
@WebServlet("/Servletproductos")
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorProducto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String accion = request.getParameter("accion");
		if (accion != null) {
			switch (accion) {
			case "editar":
				this.editarProducto(request, response);
				break;
			case "eliminar":
				this.eliminarProducto(request, response);
				break;
			default:
				this.accionDefault(request, response);
			}
		} else {
			this.accionDefault(request, response);
		}

	}

	private void accionDefault(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			List<Producto> productos = new ProductoDao().listar();
			System.out.println(productos.get(0).getNombre());
			HttpSession sesion = request.getSession();
			sesion.setAttribute("productos", productos);
			sesion.setAttribute("totalProductos", productos.size());
			sesion.setAttribute("saldoTotal", this.calcularSaldoTotal(productos));
			// request.getRequestDispatcher("admin.jsp").forward(request, response);
			response.sendRedirect("admin.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private double calcularSaldoTotal(List<Producto> productos) {

		double saldoTotal = 0;
		for (Producto producto : productos) {
			saldoTotal += (producto.getPrecio() * producto.getInventario());
		}

		return saldoTotal;
	}
	
	private void editarProducto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//tomamos el valor del id
		
		
		try {
			int id = Integer.parseInt(request.getParameter("idProducto"));
			Producto producto = new ProductoDao().encontrar(new Producto(id));
			request.setAttribute("producto", producto);
			String jspEditar= "/WEB-INF/paginas/productos/editarProducto.jsp";
			request.getRequestDispatcher(jspEditar).forward(request, response);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String accion = request.getParameter("accion");
		if (accion != null) {
			switch (accion) {
			case "insertar":
				this.insertarProducto(request, response);
				break;
			case "modificar":
				this.modificarProducto(request, response);
				break;
			default:
				this.accionDefault(request, response);
			}
		} else {
			this.accionDefault(request, response);
		}
	}

	private void insertarProducto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// se toman los valores insertados en el fomulario

		String nombre = request.getParameter("nombre");
		String precio = request.getParameter("precio");
		String inventario = request.getParameter("inventario");
		String url = request.getParameter("url");
		String seccion = request.getParameter("seccion");
		String promocion = request.getParameter("promocion");

		int precioInt = Integer.parseInt(precio);
		int iventarioInt = Integer.parseInt(inventario);

		// se crea el producto

		Producto producto = new Producto(nombre, precioInt, iventarioInt, url, seccion, promocion);

		boolean regitrarProducto = new ProductoDao().guardar_Producto(producto);

		this.accionDefault(request, response);

	}
	
	private void modificarProducto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// se toman los valores insertados en el fomulario de editar
		try {
		int id = Integer.parseInt(request.getParameter("idProducto"));
		String nombre = request.getParameter("nombre");
		String precio = request.getParameter("precio");
		String inventario = request.getParameter("inventario");
		String url = request.getParameter("url");
		String seccion = request.getParameter("seccion");
		String promocion = request.getParameter("promocion");

		int precioInt = Integer.parseInt(precio);
		int iventarioInt = Integer.parseInt(inventario);

		// modificamos el producto

		Producto producto = new Producto(id,nombre, precioInt, iventarioInt, url, seccion, promocion);

		
			int regitrosModificados = new ProductoDao().actualizar(producto);
			System.out.println("productos modificados " + regitrosModificados);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.accionDefault(request, response);

	}
	
	private void eliminarProducto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// se toman los valores insertados en el fomulario de editar
		try {
		int id = Integer.parseInt(request.getParameter("idProducto"));
		

		// eliminamos el producto

		Producto producto = new Producto(id);

		
			int regitrosModificados = new ProductoDao().eliminar(producto);
			System.out.println("productos modificados " + regitrosModificados);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.accionDefault(request, response);

	}

}
