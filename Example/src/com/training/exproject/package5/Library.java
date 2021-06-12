package com.training.exproject.package5;

public class Library {
	private Book[] books;
	private int curIndex;
	
	public Library(int size) {
		books = new Book[size];
		curIndex = 0;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
		curIndex = books.length;
	}
	
	public void add(Book book) {
		if (curIndex >= books.length) {
			throw new RuntimeException("There is no place in the library");
		}
		books[curIndex++] = book;
	}

}
