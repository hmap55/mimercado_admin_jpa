package mimercado.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mimercado.dao.UsuarioDao;
import mimercado.modelo.Usuario;

/**
 * Servlet implementation class UsuarioControlador
 */
@WebServlet("/login")
public class UsuarioControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String correo = request.getParameter("correo");
		String password = request.getParameter("password");
		
		Usuario usuario = new Usuario();
		usuario.setCorreo(correo);
		usuario.setPassword(password);
		
		UsuarioDao usuarioDao = new UsuarioDao();
		String nombre = usuarioDao.getUsuario(usuario);
		
		if(!nombre.equals("")) {
			HttpSession sesion = request.getSession();
			sesion.setAttribute("sesionLog", nombre);
			
			
			response.sendRedirect("index.jsp");
		}
		else {
			
			response.sendRedirect("inicioSesion.jsp");
			
		}
		
		
	}

}
