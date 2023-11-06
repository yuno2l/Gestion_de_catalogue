package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.Categorie;

public class GestionCategorieImpl implements IGestionCategorie {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("formation");
	EntityManager em=emf.createEntityManager();

	
	public void addCategorie(Categorie c) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(c);
		et.commit();
		
	}

	
	public List<Categorie> getAllCategories() {
		Query q = em.createQuery("select c from Categorie c");
		
		return q.getResultList();
	}

	
	public Categorie getCategorie(int id) {
		return em.find(Categorie.class, id);
	}

	
	public void deleteCategorie(int id) {
		em.getTransaction().begin();
		em.remove(getCategorie(id));
		em.getTransaction().commit();
	}
	

}
