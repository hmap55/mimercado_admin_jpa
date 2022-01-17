package mimercado.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mimercado.dao.UsuarioDao;
import mimercado.modelo.Usuario;

/**
 * Servlet implementation class RegistroUsuario
 */
@WebServlet("/RegistroUsuario")
public class RegistroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistroUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String accion = request.getParameter("accion");
		if (accion != null) {
			switch (accion) {
			case "insertar":
				String nombre = request.getParameter("nombre");
				String apellido = request.getParameter("apellido");
				String cedula = request.getParameter("cedula");
				String correo = request.getParameter("correo");
				String celular = request.getParameter("celular");
				String password = request.getParameter("password");
				String confPassword = request.getParameter("confirmar_password");
				if(password.equals(confPassword)){
				Usuario usuario = new Usuario(cedula, correo, password, nombre, apellido, celular);
				boolean guardar_usuario = new UsuarioDao().guardar_Cliente(usuario);
				response.sendRedirect("inicioSesion.jsp");
				}
				else {
					response.sendRedirect("inicio.jsp");
				}
				break;
			default:
				response.sendRedirect("inicio.jsp");
			}
		}
		else {
			response.sendRedirect("inicio.jsp");
		}
	}
}
