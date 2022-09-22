package com.masai.q4;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class Library {
public List<Book> books = new ArrayList<>();
	
	
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public boolean isEmpty() {
		return books.isEmpty();
	}
	
	public List<Book> viewAllBooks(){
		return books;
	}
	
public List<Book> viewBookByAuthor(String author){
		
		List<Book> a_books= new ArrayList<>();
		
		for(Book book:books) {
			if(book.getAuthor().equalsIgnoreCase(author))
				a_books.add(book);
		}
		
		return a_books;
	}
	
	public int countNoOfBook(String bname) {
		int number=0;
		
		for(Book book:books) {
			if(book.getBookName().equalsIgnoreCase(bname))
				number++;
		}
		
		
		return number;
	}
	
}
