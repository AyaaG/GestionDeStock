package org.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class Produit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3807600747023169695L;
	@Id
private String codePdt;
private int qtePdt;
private String nomPdt;
private String descPdt;
private double prixPdt;
public String getCodePdt() {
	return codePdt;
}
public void setCodePdt(String codePdt) {
	this.codePdt = codePdt;
}
public int getQtePdt() {
	return qtePdt;
}
public void setQtePdt(int qtePdt) {
	this.qtePdt = qtePdt;
}
public String getNomPdt() {
	return nomPdt;
}
public void setNomPdt(String nomPdt) {
	this.nomPdt = nomPdt;
}
public String getDescPdt() {
	return descPdt;
}
public void setDescPdt(String descPdt) {
	this.descPdt = descPdt;
}
public double getPrixPdt() {
	return prixPdt;
}
public void setPrixPdt(double prixPdt) {
	this.prixPdt = prixPdt;
}
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
public Produit(String codePdt, int qtePdt, String nomPdt, String descPdt, double prixPdt) {
	super();
	this.codePdt = codePdt;
	this.qtePdt = qtePdt;
	this.nomPdt = nomPdt;
	this.descPdt = descPdt;
	this.prixPdt = prixPdt;
}

}
