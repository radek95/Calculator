package com.javafee.model;

public class Addition extends Calculation {
	@Override
	public Double calculate(Double firstVariable, Double seconVariable) {
		return firstVariable + seconVariable;
	}
	
	@Override
	public Double calculate(String firstVariable, String seconVariable) {
		// TODO Auto-generated method stub
		return super.calculate(firstVariable, seconVariable);
	}
	
	@Override
	public Double calculate(Double... values) {
		// TODO Auto-generated method stub
		return super.calculate(values);
	}
}
