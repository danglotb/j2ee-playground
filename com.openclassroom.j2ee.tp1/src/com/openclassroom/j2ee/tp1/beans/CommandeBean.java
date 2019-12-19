package com.openclassroom.j2ee.tp1.beans;

/**
 * 
 * @author Benjamin Danglot
 * bdanglot@gmail.com
 * Dec 18, 2019
 *
 */
public class CommandeBean {
	
	private double montant;
	
	private String modeDePaiement;
	
	private String statusDePaiement;
	
	private String modeDeLivraison;

	private String statusDeLivraison;

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getModeDePaiement() {
		return modeDePaiement;
	}

	public void setModeDePaiement(String modeDePaiement) {
		this.modeDePaiement = modeDePaiement;
	}

	public String getStatusDePaiement() {
		return statusDePaiement;
	}

	public void setStatusDePaiement(String statusDePaiement) {
		this.statusDePaiement = statusDePaiement;
	}

	public String getModeDeLivraison() {
		return modeDeLivraison;
	}

	public void setModeDeLivraison(String modeDeLivraison) {
		this.modeDeLivraison = modeDeLivraison;
	}

	public String getStatusDeLivraison() {
		return statusDeLivraison;
	}

	public void setStatusDeLivraison(String statusDeLivraison) {
		this.statusDeLivraison = statusDeLivraison;
	}
	
}
