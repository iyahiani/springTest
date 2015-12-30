package com.ismail.spring.mvc.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.ismail.spring.mvc.services.*;

public class ResrvationQueryController extends AbstractController {

	private ReservationServiceImp reservationSrvc ;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String court = ServletRequestUtils.getStringParameter(request, "courtName") ; 
		Map<String, Object> model = new HashMap<String, Object>() ; 
		if (court != null){
			model.put("courtName", court);
			model.put("reservations", model);
		} 
		return new ModelAndView("reservationQuery",model);
	}

	public void setReservationSrvc(ReservationServiceImp reservationSrvc) {
		this.reservationSrvc = reservationSrvc;
	}
   
}
