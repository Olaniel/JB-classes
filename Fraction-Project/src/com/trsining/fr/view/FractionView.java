package com.trsining.fr.view;

import com.trsining.fr.bean.Fraction;

public class FractionView {
	
	/*
	 * public void printArOp(Fraction f1, Fraction f2, Fraction rez, char op) {
	 * printFractionInOneLine(f1); System.out.print(op); printFractionInOneLine(f2);
	 * System.out.print("="); printFractionInOneLine(rez); }
	 * 
	 * 
	 * private void printFractionInOneLine(Fraction f) {
	 * System.out.print(f.getNumerator() + "/" + f.getDenominator()); }
	 */
	
	
	public String printArOp(Fraction f1, Fraction f2, Fraction rez, char op) {
		String str;
		str = printFractionInOneLine(f1);
		str = str + op;
		str = str + printFractionInOneLine(f2);
		str = str + "=";
		str = str + printFractionInOneLine(rez);
		
		return str;
	}
	
	
	private String printFractionInOneLine(Fraction f) {
		return f.getNumerator() + "/" + f.getDenominator();
	}
}
