package com.ismail.spring.classe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;

import com.ismail.spring.interfaces.IArithmiticCalcules;

public class ArithmiticCalculeImpl implements IArithmiticCalcules, PreparedStatementCreator{

	@Override
	public double add(double a, double b) {
		double rslt = a+b;
		System.out.println("addition = "+rslt);
		return rslt;
	}

	@Override
	public double sub(double a, double b) {
		double rslt = a-b;
		System.out.println("soustraction = "+rslt);
		return rslt;	}

	@Override
	public double mul(double a, double b) {
		double rslt = a*b;
		System.out.println("multiplication = "+rslt);
		return rslt;
	}

	@Override
	public double div(double a, double b) {
		if(b==0) throw new IllegalArgumentException("divisionb par zéro") ; 
		double rslt = a / b;
		System.out.println("division = "+rslt);
		return rslt;

	}

	@Override
	public PreparedStatement createPreparedStatement(Connection con)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
