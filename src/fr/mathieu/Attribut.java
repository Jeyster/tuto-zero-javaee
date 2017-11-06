package fr.mathieu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Attribut extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		String paramName = req.getParameter("name");
		req.setAttribute("sendedName", paramName);
		this.getServletContext().getRequestDispatcher("/WEB-INF/attribut.jsp").forward(req, resp);
		
		
	}
	
	
	
}
