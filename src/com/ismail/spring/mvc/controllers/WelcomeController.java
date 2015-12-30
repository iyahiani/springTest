package com.ismail.spring.mvc.controllers;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WelcomeController extends AbstractController {// implements Controller

	/*@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {

		Date today = new Date();

		return new ModelAndView("welcom", "toDay", today);
	}*/

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {

		Date today = new Date();

		return new ModelAndView("welcom", "toDay", today);
	}

}
