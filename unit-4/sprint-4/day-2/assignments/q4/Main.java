package com.masai.q4;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Library library = new Library();
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
		
		System.out.println("1.Add Book");
		System.out.println("2.Display all Book details");
		System.out.println("3.Search Book by author");
		System.out.println("4.Count number of books - by book name");
		System.out.println("5.Exit");
		
		System.out.println("Enter choice :");
		
		int choice = sc.nextInt();
		
		
		switch (choice) {
		case 1:
			
			System.out.println("Enter isbn no:");
			int isbn=sc.nextInt();
			
			System.out.println("Enter Book name:");
			String bname=sc.next();
			
			System.out.println("Enter Author name:");
			String author=sc.next();
			
			library.addBook(new Book(isbn, bname, author));
			
			System.out.println("Book added successfully...");
			
			break;

		case 2:
			
			List<Book> books= library.viewAllBooks();
			
			for(Book book: books) {
				System.out.println(book);
			}
			
			break;
			
		case 3:
			System.out.println("Enter author Name:");
			String aut_name=sc.next();
			
			List<Book> a_books= library.viewBookByAuthor(aut_name);			
			
			if(a_books.size()>0) {
				
				for(Book book: a_books) {
					System.out.println(book);
				}
				
			}else
				System.out.println("No book found..");
	
			break;
			
		case 4:
			
			System.out.println("Enter BookName");
			String bookName=sc.next();
		
			int number= library.countNoOfBook(bookName);
			
			System.out.println("Number of Books are: "+number);
			
			break;
			
		case 5:
			System.out.println("Thank You...");
			break;
	
		default:
			System.out.println("Enter a valid number");
			break;
		}
		
		if(choice == 5)
			break;
		
		}
		sc.close();
		
	}


}
