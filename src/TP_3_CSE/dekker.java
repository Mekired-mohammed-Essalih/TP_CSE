package TP_3_CSE;

public  class dekker implements Solution{
  ;
	private volatile static boolean []flag;
	private volatile int turn;
	public dekker(int n) {
		flag=new boolean[n];
	}
	;
	
	
	public void entrySection(TicketProvider ticketProvider) {
		flag[ticketProvider.getId()]=true;
		turn=0;
		while(flag[ticketProvider.getId()]==true && turn==1) {};
		
	}
	public void exitSection(TicketProvider ticketProvider) {
		flag[ticketProvider.getId()]=false;
	}
	
	
	
}
