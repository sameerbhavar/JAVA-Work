package com.q3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t1=new Ticket();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter No Of Bookings");
		
		int noofbookings=sc.nextInt();
		System.out.println("Enter the available Ticket");
		 int avlTickets=sc.nextInt();
		 Ticket.setAvailableTickets(avlTickets);
		 
		 for(int i=0;i<noofbookings;i++)
		 {
			 System.out.println("Enter the ticketid");
			 int ticketID=sc.nextInt();
			 
			 System.out.println("Enter the Price");
			 int price=sc.nextInt();
			 
			 System.out.println("Enter the No of Tickets");
			 int nooftickets=sc.nextInt();
			 
			 t1.setPrice(price);
			 t1.setTicketid(ticketID);
			 System.out.println("Available tickets:"+Ticket.getAvailableTickets());
			 
			 int total=t1.calculateTicketCost(nooftickets);
			 
			 System.out.println("total amount:"+total);
			 System.out.println("availble ticket after booking:"+Ticket.getAvailableTickets());
			 
		 }
		sc.close();
		
	}

}
