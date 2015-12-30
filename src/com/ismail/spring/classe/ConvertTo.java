package com.ismail.spring.classe;

import com.ismail.spring.interfaces.IUnitsConvertion;

public class ConvertTo implements IUnitsConvertion {

	@Override
	public double kiloToPound(double kilo) {
		double pound = kilo * 2.2 ;
		System.out.println("Kilo = "+kilo + "\t Pound = "+ pound); 
		return pound ;
	}

	@Override
	public double kilometreToMile(double kilometre) {
		double mile = kilometre*0.62 ;
		System.out.println("kilometre = "+kilometre+"\t miles = "+mile );
		return mile ;
	}

}
