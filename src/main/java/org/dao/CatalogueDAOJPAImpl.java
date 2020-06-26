package org.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.entities.Produit;

public class CatalogueDAOJPAImpl implements ICatalogueDAO{
	@PersistenceContext
private EntityManager em;
	
	public void addProduit(Produit p) {
	em.persist(p);
	}

	public List<Produit> listProduits() {
		Query req=em.createQuery("select p from Produit p");
		return req.getResultList();
	}

	public Produit getProduit(String codePdt) {
	
		return em.find(Produit.class, codePdt);
	}


	public void deleteProduit(String codePdt) {
      Produit p = getProduit(codePdt);
          em.remove(p);
		
	}

	public void updateProduit(Produit p) {
	em.merge(p);
		
	}

}
