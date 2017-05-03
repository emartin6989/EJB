package metier;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Produit.findAll", query = "SELECT p FROM Produit p")
public class Produit implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    private int quantite;
    private double prix;

    /**
     * @return the id
     */
    public int getId() {
	return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(int id) {
	this.id = id;
    }

    /**
     * @return the nom
     */
    public String getNom() {
	return nom;
    }

    /**
     * @param nom
     *            the nom to set
     */
    public void setNom(String nom) {
	this.nom = nom;
    }

    /**
     * @return the quantite
     */
    public int getQuantite() {
	return quantite;
    }

    /**
     * @param quantite
     *            the quantite to set
     */
    public void setQuantite(int quantite) {
	this.quantite = quantite;
    }

    /**
     * @return the prix
     */
    public double getPrix() {
	return prix;
    }

    /**
     * @param prix
     *            the prix to set
     */
    public void setPrix(double prix) {
	this.prix = prix;
    }

    public Produit() {
	super();
    }

}
