package com.ismail.spring.mvc.interfaces;

import java.util.List;

import com.ismail.spring.mvc.model.Reservation;

public interface IgetAllReservations {

	public List<Reservation> getReservation(String courtName); 
}
