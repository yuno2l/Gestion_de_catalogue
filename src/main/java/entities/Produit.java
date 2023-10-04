package entities;

public class Produit {

	private int id;
	private String nom;
	private int qte;
	private double prix;
	
	public Produit(int id, String nom, double prix, int qte) {
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.qte = qte;
	}
	
	public Produit(String nom, double prix, int qte) {
		
		this.nom = nom;
		this.prix = prix;
		this.qte = qte;
	}
	
	public Produit() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

}
