package TP_3;

public class rendthread extends Thread {
	public int ID;
	public static int N;
	public static int co=0;
	Moniteur monitor;
	public rendthread(int ID,Moniteur monitor,int n) {
		this.N=n;
		this.ID=ID;
		this.monitor=monitor;
	}
	@Override
    public void run()  {
		//co=co+1;
		//System.out.println(co);
		//if(co<N) {
		//System.out.println("processus"+this.ID+" block");
		try {
			monitor.processus(N,ID);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("processus"+this.ID+" active");
		
		
	}

	

}
