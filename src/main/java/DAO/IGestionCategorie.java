package DAO;

import java.util.List;

import entities.Categorie;
import entities.Produit;

public interface IGestionCategorie {
	public void addCategorie(Categorie c);
	public List<Categorie> getAllCategories();
	public Categorie getCategorie(int id);
	public void deleteCategorie(int id);
	List<Produit> getCategorieByMc(String mc);
	void updateCategorie(Categorie p);
	
}
