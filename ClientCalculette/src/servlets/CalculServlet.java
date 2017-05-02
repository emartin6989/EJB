package servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejb.CalculatriceLocal;
import ejb.CalculatriceRemote;

/**
 * Servlet implementation class CalculServlet
 */
@WebServlet("/CalculServlet")
public class CalculServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private CalculatriceRemote calculatriceRemote;
	@EJB
	private CalculatriceLocal calculatriceLocal;
	/**
	 * @see HttpServlet#HttpServlet()
	 */

	public CalculServlet() {
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
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		int resultat1=0;
		int resultat2=0;
		int resultat3=0;
		int resultat4=0;
		
			resultat1= calculatriceRemote.addition(x, y);
			resultat2= calculatriceRemote.soustraction(x, y);
			resultat3= calculatriceRemote.division(x, y);
			resultat4= calculatriceLocal.multiplication(x, y);
			
			request.setAttribute("resultat1", resultat1);
			request.setAttribute("resultat2", resultat2);
			request.setAttribute("resultat3", resultat3);
			request.setAttribute("resultat4", resultat4);
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
