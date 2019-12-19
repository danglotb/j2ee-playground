package com.openclassroom.j2ee.tp1.beans;

/**
 * 
 * @author Benjamin Danglot
 * bdanglot@gmail.com
 * Dec 18, 2019
 *
 */
public class ClientBean {
	
	private String nom;
	
	private String prenom;
	
	private String adresse;
	
	private String telephone;
	
	private String email;
	
	public ClientBean() {
		
	}
	
	public ClientBean(String nom, String prenom, String adresse, String telephone, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
