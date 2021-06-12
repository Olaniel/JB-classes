package com.training.exproject.package7;

import java.util.ArrayList;
import java.util.List;

public class ListInspector {

	public static void main(String[] args) {
		List<String> colors = new ArrayList<String>();
		
		colors.add("white");
		colors.add("yellow");
		colors.add("bronze");
		colors.add("red");
		colors.add("pink");
		
		for(int i=0; i<colors.size(); i++) {
			String c = colors.get(i);
			System.out.println(" - " + c);
		}
	}

}
