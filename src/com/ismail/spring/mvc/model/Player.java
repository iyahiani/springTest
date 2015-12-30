package com.ismail.spring.mvc.model;

public class Player {

	private String nom ; 
	private String phone  ;

	
	
	public Player() {}	
	public Player(String nom, String phone) {
		super();
		this.nom = nom;
		this.phone = phone;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
