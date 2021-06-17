package com.trsining.fr.bean;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction() {
		numerator = 0;
		denominator = 1;
	}

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		if (denominator == 0) {
			throw new RuntimeException("The denominator is zero.");
		}
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int _numerator) {
		numerator = _numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int _denominator) {
		if (_denominator == 0) {
			throw new RuntimeException("The denominator is zero.");
		}
		denominator = _denominator;
	}
	
	//equals
	//hashCode
	//toString
	// Serializable
}
