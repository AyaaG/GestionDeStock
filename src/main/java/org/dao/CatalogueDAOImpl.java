package org.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.entities.Produit;

public class CatalogueDAOImpl implements ICatalogueDAO{
	private Map<String, Produit> produits= new HashMap<String, Produit>();
	Logger log=Logger.getLogger(this.getClass());

	public void addProduit(Produit p) {
	produits.put(p.getCodePdt(), p);
		
	}

	public List<Produit> listProduits() {
		
		return new ArrayList<Produit>(produits.values());
	}


	public Produit getProduit(String codePdt) {
		
		return produits.get(codePdt);
	}

	public void deleteProduit(String codePdt) {
		produits.remove(codePdt);
		
	}


	public void updateProduit(Produit p) {
		produits.put(p.getCodePdt(), p);
		
	}
	public void initialisation() {
		addProduit(new Produit("hhff9",15,"Smart Tv", "it's a nice ..", 4567888));
		addProduit(new Produit("gyhui",201,"Jackets", "it's a nice ..", 888));
		addProduit(new Produit("hhj",105,"Smart Tv", "it's a nice ..", 4567088));
		log.info("Initialisation des produits");
	}

}
