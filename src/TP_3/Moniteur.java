package TP_3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Moniteur {
	private Condition c;
	ReentrantLock monitor= new ReentrantLock();
    public static int cpt=0;
    
     public Moniteur() {
    	 c=monitor.newCondition();
     }
    
    public void processus(int N,int b) throws InterruptedException {
    	monitor.lock();
    	cpt=cpt+1;
    	if(cpt<N) {
    		System.out.println("processus"+b+" block");
    		c.await();
    		System.out.println("processus"+b+" active");
    		
    	}else {
    		System.out.println("processus"+b+" active toute les processus");
    		for(int i=1;i<N;i++) {
    		c.signal();
    		
    		}
    		
    	}
    	monitor.unlock();
    	
    }
    
}
