package com.ismail.spring.mvc.services;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import com.ismail.spring.mvc.interfaces.IgetAllReservations;
import com.ismail.spring.mvc.model.Player;
import com.ismail.spring.mvc.model.Reservation;
import com.ismail.spring.mvc.model.SportType;

public class ReservationServiceImp implements IgetAllReservations {

	private static final SportType tennis = new SportType(1,"tennis");
	private static final SportType foot = new SportType(2,"foot");
	private List<Reservation> reservations  ;
	
	public ReservationServiceImp() {
	    this.reservations = new ArrayList<>(); 
	    reservations.add(new  Reservation("TENNIS", new GregorianCalendar(2015, 12, 01).getTime(), 21, new Player("ismail", "0611868198"), tennis)) ;
	    reservations.add(new  Reservation("FOOT", new GregorianCalendar(2015, 12, 01).getTime(), 19, new Player("beloumi", "0611855198"), foot)) ;
	}
	
	@Override
	public List<Reservation> getReservation(String courtName) {
		List<Reservation> resultat = new ArrayList<Reservation>() ;
		
		for (Reservation reservation : this.reservations) {
			if (reservation.getCourtName().endsWith(courtName))  resultat.add(reservation);
		} 
		
		return resultat;
		
	}

}
