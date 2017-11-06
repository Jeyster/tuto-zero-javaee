package fr.mathieu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String message = "Transmission de vriables: OK !";
		req.setAttribute("test", message);
		this.getServletContext().getRequestDispatcher("/WEB-INF/test.jsp").forward(req, resp);
		
	}
	
	

}
