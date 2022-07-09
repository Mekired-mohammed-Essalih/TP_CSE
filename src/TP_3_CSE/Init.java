package TP_3_CSE;

public class Init {
	public static void init(int i, int numberOfTicketProviders, Solution NP ) {
        Parking.setCapacity(i);
        for (int j=0;j<numberOfTicketProviders;j++){
             new Thread(new TicketProvider(j, NP)).start();
        }

    }

}
