package org.service;

import java.util.List;



import org.dao.ICatalogueDAO;
import org.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
@Transactional

public class CatalogueServiceImpl implements ICatalogueService {
	private ICatalogueDAO dao;

	public void setDao(ICatalogueDAO dao) {
		this.dao = dao;
	}

	public void addProduit(Produit p) {
		dao.addProduit(p);
		
	}

	
	public List<Produit> listProduits() {
	
		return dao.listProduits();
	}

	public Produit getProduit(String codePdt) {
		
		return dao.getProduit(codePdt);
	}


	public void deleteProduit(String codePdt) {
	dao.deleteProduit(codePdt);
		
	}

	
	public void updateProduit(Produit p) {
		dao.updateProduit(p);
		
	}

}
