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
@WebServlet("/AjoutServlet")
public class AjoutServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @EJB
    ProduitRemote pr;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	// 1 récupérer les param utilisateurs
	// je récupere les données saisies dans des variables
	String nom = request.getParameter("nom");
	int quantite = Integer.parseInt(request.getParameter("quantite"));
	double prix = Double.parseDouble(request.getParameter("prix"));

	// 2 faire les traitements avec la couche service
	Produit p = new Produit();
	p.setNom(nom);
	p.setQuantite(quantite);
	p.setPrix(prix);

	// appeler l'interface service pour utiliser la methode ajout

	pr.ajouterProduit(p);

	// 3 préparer l'envoi des elts à la JSP
	// à gauche c'est le nom de l'attribut qu'on donnera dans la JSP. A
	// droite c'est le nom de la variable concernée dans la servlet
	request.setAttribute("id", p.getId());
	request.setAttribute("nom", p.getNom());
	request.setAttribute("quantite", p.getQuantite());
	request.setAttribute("prix", p.getPrix());

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
