package com.ismail.spring.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ismail.spring.classe.ArithmiticCalculeImpl;
import com.ismail.spring.classe.ConvertTo;

public class Run {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml") ;
		ArithmiticCalculeImpl calculeImpl = (ArithmiticCalculeImpl) context.getBean("arithmiticCalcul") ;
		ConvertTo convertTo = (ConvertTo) context.getBean("unitConvert"); 
		calculeImpl.add(2, 2);calculeImpl.sub(4, 2);calculeImpl.mul(3, 2);calculeImpl.div(8, 2);
		convertTo.kilometreToMile(3.5) ;convertTo.kiloToPound(35) ;
	}
}
