package com.trsining.fr.logic;

import com.trsining.fr.bean.Fraction;

public class FractionLogic {
	
	public Fraction addition(Fraction f1, Fraction f2) {
		int num, den;

		den = f1.getDenominator() * f2.getDenominator();
		num = f1.getNumerator() * f2.getDenominator() + f2.getNumerator() * f2.getDenominator();

		Fraction result = new Fraction(num, den);

		return result;
	}

	public Fraction subtraction(Fraction f1, Fraction f2) {
		int num, den;

		den = f1.getDenominator() * f2.getDenominator();
		num = f1.getNumerator() * f2.getDenominator() - f2.getNumerator() * f2.getDenominator();

		Fraction result = new Fraction(num, den);

		return result;
	}
	
}
