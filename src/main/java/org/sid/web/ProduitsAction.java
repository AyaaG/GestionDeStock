package org.sid.web;

import java.util.List;

import org.apache.log4j.Logger;
import org.entities.Produit;
import org.service.ICatalogueService;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

public class ProduitsAction extends ActionSupport {
	public Produit produit = new Produit();
	public List<Produit> produits;
	public String code;
	public boolean editMode = false;
	@Autowired
	private ICatalogueService service;
	Logger logger = Logger.getLogger(this.getClass());

	public String index() {
		produits = service.listProduits();
		return SUCCESS;
	}

	public String save() {
		if (editMode == false)
			service.addProduit(produit);
		else {
			service.updateProduit(produit);
			editMode = false;
			produit = new Produit();
		}
		produits = service.listProduits();
		return SUCCESS;
	}

	public String delete() {
		service.deleteProduit(code);
		produits = service.listProduits();
		return SUCCESS;
	}

	public String edit() {
		editMode = true;
		produit = service.getProduit(code);
		produits = service.listProduits();
		return SUCCESS;
	}

}
