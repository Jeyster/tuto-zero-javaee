package fr.mathieu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Coyote extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		
		/* Création du bean */
		CoyoteBean premierBean = new CoyoteBean();
		/* Initialisation de ses prepriétés */
		premierBean.setNom("Coyote");
		premierBean.setPrenom("Mat");
		
		/* Stockage du bean dans l'objet req */
		req.setAttribute("coyote", premierBean);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/coyote.jsp").forward(req, resp);
		
		
	}
	
	
	
}
