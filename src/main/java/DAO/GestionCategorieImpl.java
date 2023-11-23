package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.isitcom.formationSpringboot.demo1.services.IGestionCategorie;

import entities.Categorie;
import entities.Produit;

public class GestionCategorieImpl implements IGestionCategorie {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("formation");
	EntityManager em=emf.createEntityManager();

	@Override
	public void addCategorie(Categorie c) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(c);
		et.commit();
		
	}

	@Override
	public List<Categorie> getAllCategories() {
		Query q = em.createQuery("select c from Categorie c");
		
		return q.getResultList();
	}

	@Override
	public Categorie getCategorie(int id) {
		return em.find(Categorie.class, id);
	}

	@Override
	public void deleteCategorie(int id) {
		em.getTransaction().begin();
		em.remove(getCategorie(id));
		em.getTransaction().commit();	
	}
	
	@Override
	public List<Produit> getCategorieByMc(String mc) {
		Query q = em.createQuery("select p from Categorie p where p.nom like :x");
		q.setParameter("x","%"+mc+"%");
		
		return q.getResultList();
	}
	
	
	@Override
	public void updateCategorie(Categorie p) {
		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
	}
	

}
