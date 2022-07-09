package TP_3;

import java.util.Scanner;

public class main_rendthread {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("entrez nombre de processus:");
		int N=sc.nextInt();
		Moniteur m=new Moniteur();
		for (int j=1;j<N+1;j++){
        	new rendthread(j,m,N).start();
        }
		// TODO Auto-generated method stub

	}

}
