package TP_3_CSE;

import java.util.Scanner;

public class Main_parking {
	static symaphore s=new symaphore();

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        System.out.println("please enter the number of Ticket Providers");
	        int numberOfTicketProviders = sc.nextInt();
	        //Init.init(1000, numberOfTicketProviders,new NoProtection(numberOfTicketProviders) );
	       // Init.init(1000, numberOfTicketProviders, s);
	       // Init.init(1000, numberOfTicketProviders,new Avec_protection(numberOfTicketProviders));
	       // Init.init(1000, numberOfTicketProviders, new dekker(numberOfTicketProviders));
		// TODO Auto-generated method stub

	}

}
