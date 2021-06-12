package com.training.exproject.package5;

public class LibraryInspector {

	public static void main(String[] args) {
		Library lib = new Library(5);
		
		lib.add(new Book("Java", "Ekkel", 2003, 300));
		lib.add(new Book("Java", "Ekkel", 2013, 300));

	}

}
