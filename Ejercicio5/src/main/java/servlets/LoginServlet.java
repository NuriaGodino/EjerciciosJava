package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidad.Usuario;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Boolean userRegistrado = false;
		List<Usuario> ls = new ArrayList<Usuario>();
		Usuario a = new Usuario("Alfonso", "alfonso");
		Usuario b = new Usuario("Felix", "felix");
		Usuario c = new Usuario("Nuria", "nuria");
		ls.add(a); ls.add(b); ls.add(c);
		
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		for(int i = 0; i < ls.size(); i++) {
			String s1 = ls.get(i).getUsuario();
			String s2 = ls.get(i).getPassword();
			if(s1.equals(usuario) && s2.equals(password)) {
				userRegistrado = true;
			}
		}
		
		if(userRegistrado == true) {
			RequestDispatcher rd = request.getRequestDispatcher("bienvenida.jsp");
			request.setAttribute("usuario", usuario);
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("npBienvenida.jsp");
			request.setAttribute("desconocido", "Desconocido");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
