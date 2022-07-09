package TP_3_CSE;

public class NoProtection implements Solution {
	public static int[] arry;
    public static boolean []choosing;

    public NoProtection(int n){
        arry=new int[n];
        choosing= new boolean[n];
    }


    @Override
    public void entrySection(TicketProvider ticketProvider) {

	

}
@Override
public void exitSection(TicketProvider ticketProvider) {
    
}
}
