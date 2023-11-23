package DAO;

import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.isitcom.formationSpringboot.demo1.services.IGestionProduit;

import javax.persistence.*;

import entities.Produit;

public class GestionCatalogueImplJPA implements IGestionProduit {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("formation");
	EntityManager em=emf.createEntityManager();
	

	@Override
	public void addProduit(Produit p) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(p);
		et.commit();
		
	}

	@Override
	public List<Produit> getAllProducts() {
		Query q = em.createQuery("select p from Produit p");
		
		return q.getResultList();
	}

	@Override
	public void deleteProduct(int id) {
		em.getTransaction().begin();
		em.remove(getProductById(id));
		em.getTransaction().commit();
	}

	@Override
	public Produit getProductById(int id) {
		return em.find(Produit.class, id);
	}

	@Override
	public List<Produit> getProductByMc(String mc) {
		Query q = em.createQuery("select p from Produit p where p.nom like :x");
		q.setParameter("x","%"+mc+"%");
		
		return q.getResultList();
	}

	@Override
	public void updateProduct(Produit p) {
		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
	}
	
}