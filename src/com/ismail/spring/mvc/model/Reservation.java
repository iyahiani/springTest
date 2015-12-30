package com.ismail.spring.mvc.model;

import java.util.Date;

public class Reservation {

	private String courtName ;
	private Date date ; 
	private int hour ; 
	private Player joueur ;
	private SportType sportType ;
	
	
	public Reservation() {}
	public Reservation(String courtName, Date date, int hour, Player joueur,
			SportType sportType) {
		super();
		this.courtName = courtName;
		this.date = date;
		this.hour = hour;
		this.joueur = joueur;
		this.sportType = sportType;
	}
	public String getCourtName() {
		return courtName;
	}
	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public Player getJoueur() {
		return joueur;
	}
	public void setJoueur(Player joueur) {
		this.joueur = joueur;
	}
	public SportType getSportType() {
		return sportType;
	}
	public void setSportType(SportType sportType) {
		this.sportType = sportType;
	}
}
