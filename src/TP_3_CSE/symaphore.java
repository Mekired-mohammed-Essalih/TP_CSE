package TP_3_CSE;
import java.util.concurrent.Semaphore;
public class symaphore implements Solution {
	
    private static volatile Semaphore mutex=new Semaphore(1 ,true);
    @Override
    public void entrySection(TicketProvider ticketProvider) {
        mutex.acquireUninterruptibly();

    }

    @Override
    public void exitSection(TicketProvider ticketProvider) {
        mutex.release();

    }
}