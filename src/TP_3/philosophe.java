package TP_3;

public class philosophe extends Thread{

	int ID;
    DP1 monitor;
    public philosophe(int ID,DP1 dp){
        this.ID=ID;
        this.monitor=dp;
    }
    @Override
    public void run()  {
    	while(true) {
        System.out.println("penser philosophe"+ID);
        try {
            monitor.Prendrebaguette(ID);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            monitor.Prendrebaguette((ID+1)%5);;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("manger philisophe "+ID);
        try {
            monitor.Deposerbaguettes(ID);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    }
}
