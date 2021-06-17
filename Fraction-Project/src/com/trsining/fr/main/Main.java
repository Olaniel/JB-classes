package com.trsining.fr.main;

import com.trsining.fr.bean.Fraction;
import com.trsining.fr.logic.FractionLogic;
import com.trsining.fr.view.FractionView;

public class Main {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3, 4);
		
		FractionLogic logic = new FractionLogic();
		FractionView view = new FractionView();
		
		Fraction f;
		
		f = logic.addition(f1, f2);
		
		String fractionView = view.printArOp(f1, f2, f, '+');
		
		System.out.println(fractionView);

	}

}
