package servlets;

import java.io.IOException;

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
@WebServlet("/SupprServlet")
public class SupprServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @EJB
    ProduitRemote pr;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	// 1 récupérer les param utilisateurs
	// je récupere les données saisies dans des variables
	int id = Integer.parseInt(request.getParameter("id"));
	// 2 faire les traitements avec la couche service
	Produit p = pr.getProduit(id);

	// appeler l'interface service pour utiliser la methode ajout

	pr.supprimerProduit(p);

	// 4 envoi des elts à la JSP
	// on indique le nom de la jsp concernée
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
