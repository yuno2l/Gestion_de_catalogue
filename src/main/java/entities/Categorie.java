package entities;

import javax.persistence.*;
import java.util.*;
@Entity
public class Categorie {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	@OneToMany (mappedBy = "categorie", cascade = CascadeType.ALL)
	private List<Produit> liste;
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
	public List<Produit> getListe() {
		return liste;
	}
	public void setListe(List<Produit> liste) {
		this.liste = liste;
	}
	public Categorie(int id, String nom, List<Produit> liste) {
		super();
		this.id = id;
		this.nom = nom;
		this.liste = liste;
	}
	
	public Categorie() {
		
	}
	public Categorie(String nom) {
		this.nom = nom;
	}
	
	public Categorie(int id,String nom) {
		this.nom = nom;
		this.id = id;
	}
}
