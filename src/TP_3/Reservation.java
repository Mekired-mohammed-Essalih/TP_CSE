package TP_3;

public class Reservation extends Thread {
	private volatile static int NombrePlaces = 100000;
	private int id,NombreTickets = 0;
	private volatile static boolean flag[];
	private volatile int turn;
	
	
	public Reservation(int id) {
		this.id = id;
	}
	
	void code_entree() {
		flag[id]=true;
		turn=0;
		
	}
	void code_sortie () {
		flag[id]=false;
	}
	
	@Override
	public void run() {
			 while (NombrePlaces > 0) {
				  NombrePlaces--;
				  this.NombreTickets++;
				  
				}
		
		System.out.printf("Client %d a acquis %d tickets.%n",
				this.id, this.NombreTickets);
		
	}
	
	
	
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			
			new Reservation(i).start();		
		}
	}

}
