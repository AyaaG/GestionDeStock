package org.service;

import java.util.List;

import org.entities.Produit;

public interface ICatalogueService {
	public void addProduit(Produit p);
	public List<Produit> listProduits();
	public Produit getProduit(String codePdt);
	public void deleteProduit(String codePdt);
	public void updateProduit(Produit p);

}
