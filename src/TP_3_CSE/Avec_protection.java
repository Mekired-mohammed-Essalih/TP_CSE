package TP_3_CSE;

public class Avec_protection implements Solution {
	public static int[] arry;
    public static boolean []choosing;

    public Avec_protection(int n){
        arry=new int[n];
        choosing= new boolean[n];
    }


    @Override
    public void entrySection(TicketProvider ticketProvider) {

	do {
        choosing[ticketProvider.getId()] = true ;
        int max=arry[0];
        for (int k=1;k<arry.length;k++){
            if (max<arry[k]){
                max=arry[k];
            }
        }
        arry[ticketProvider.getId()]=max+1;
        choosing[ticketProvider.getId()] = false ;
        for (int j=0;j<arry.length;j++){
            while (choosing[j]){}
            while ((arry[j]!=0) && ((arry[j]<arry[ticketProvider.getId()]) || ((arry[j]==arry[ticketProvider.getId()]) && (j<ticketProvider.getId())))){}
        }

    }while (false);

}

public void exitSection(TicketProvider ticketProvider) {
    arry[ticketProvider.getId()]=0;
}

}
