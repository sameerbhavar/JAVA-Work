package com.masai.q1;
import java.util.TreeSet;
public class Library {

	
	public static void main(String[] args) {
		//Use suitable collection to store books by the name booksCollection
		TreeSet<Book> booksCollection= new TreeSet<>();
		
		
		
		booksCollection.add(new Book(1,"Name1","Author1"));
		booksCollection.add(new Book(2,"Name2","Author1"));
		booksCollection.add(new Book(3,"Name1","Author1"));
		booksCollection.add(new Book(1,"Name4","Author2"));
		
		for(Book b:booksCollection)
		{
			System.out.println("Book{bookId="+b.getBookId()+", "
					+ "bookName="+b.getBookName()+",author="+b.getAuthor()+"}");
		}
		//Implement the logic to iterate through the collection and print the books
		}
	
}
