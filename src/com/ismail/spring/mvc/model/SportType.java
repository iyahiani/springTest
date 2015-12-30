package com.ismail.spring.mvc.model;

public class SportType {

	private String nomSport ; 
	private int id ;
	
	public SportType() {}
	public SportType( int id,String nomSport) {
		super();
		this.nomSport = nomSport;
		this.id = id;
	}
	public String getNomSport() {
		return nomSport;
	}
	public void setNomSport(String nomSport) {
		this.nomSport = nomSport;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
