package session;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import metier.Produit;

/**
 * Session Bean implementation class ProduitEJBImpl
 */
@Stateless
public class ProduitEJBImpl implements ProduitRemote, ProduitLocal {

    @PersistenceContext(name = "ejb-pu")
    private EntityManager em;

    @Override
    public int ajouterProduit(Produit p) {
	em.persist(p);
	return p.getId();
    }

    @Override
    public Produit modifierProduit(Produit p) {
	em.merge(p);
	return p;
    }

    @Override
    public Produit getProduit(int idProduit) {

	return em.find(Produit.class, idProduit);
    }

    @Override
    public void supprimerProduit(Produit p) {
	em.remove(em.contains(p) ? p : em.merge(p));

    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Produit> findAllProduit() {
	List<Produit> listeP = em.createNamedQuery("Produit.findAll").getResultList();
	return listeP;
    }

}
