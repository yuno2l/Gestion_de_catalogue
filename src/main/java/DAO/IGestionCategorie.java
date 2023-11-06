package DAO;

import java.util.List;

import entities.Categorie;

public interface IGestionCategorie {
	public void addCategorie(Categorie c);
	public List<Categorie> getAllCategories();
	public Categorie getCategorie(int id);
	public void deleteCategorie(int id);
}
