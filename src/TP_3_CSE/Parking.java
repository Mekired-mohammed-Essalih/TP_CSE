package TP_3_CSE;

import java.util.Scanner;

public class Parking {


	    private static int capacity;

	    public static void setCapacity(int capacity) {
	        Parking.capacity = capacity;
	    }

	    public static boolean decreaseCapacity() {
	        if (capacity > 0) {
	            capacity--;
	            return true;
	        }
	        return false;
	    }
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("please enter the number of Ticket Providers");
	        int numberOfTicketProviders = sc.nextInt();
	        Init.init(1000, numberOfTicketProviders, new Avec_protection(numberOfTicketProviders));
	    }

}
