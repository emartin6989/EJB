package servlets;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Produit;
import session.ProduitRemote;

/**
 * Servlet implementation class CrudServlet
 */
@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @EJB
    ProduitRemote pr;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	// appeler l'interface service pour utiliser la methode ajout

	List<Produit> listeP = pr.findAllProduit();

	// 3 pr�parer l'envoi des elts � la JSP
	// � gauche c'est le nom de l'attribut qu'on donnera dans la JSP. A
	// droite c'est le nom de la variable concern�e dans la servlet
	request.setAttribute("listeP", listeP);
	// 4 envoi des elts � la JSP
	// on indique le nom de la jsp concern�e
	request.getRequestDispatcher("/lister.jsp").forward(request, response);
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
