package TP_3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class DP1 {
	private boolean Baguettelibre[]= new boolean[5];
    private Condition Attendrebaguette[]=new Condition[5];
    ReentrantLock monitor= new ReentrantLock();
    
    public DP1() {
        for (int i = 0; i <= 4; i++) {
            Baguettelibre[i] = true;
        }
        for (int i = 0; i <= 4; i++) {
            Attendrebaguette[i] =  monitor.newCondition();
        }
    
    }
    public void Prendrebaguette(int i) throws Exception {
    	monitor.lock();
    	if(!Baguettelibre[i]) {
    		Attendrebaguette[i].await();
    	}
    	Baguettelibre[i]=false;
    	monitor.unlock();
    }
    public void Deposerbaguettes(int i) {
    	monitor.lock();
    	Baguettelibre[i]=false;
    	Baguettelibre[(i+1)%5]=true;
    	Attendrebaguette[i].signal();
    	Attendrebaguette[(i+1)%5].signal();
    	monitor.unlock();
    }
    
 
    
    
}
