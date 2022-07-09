package TP_3;

import java.util.Random;
import java.util.Scanner;

public class mssc_tp2 {
	static int N,M;
	static int E;
	//static int[][] tab1=new int[N][M];
	//static int [][] tab2=new int[N][M];
	static int co;
	static Random random=new Random();
	
	
	

	public static void main(String[] args) throws Exception {
		Scanner lire=new Scanner(System.in);
		System.out.println("entrez N et M:");
		N=lire.nextInt();
		M=lire.nextInt();
		int[][] tab1=new int[N][M];
		int[][] tab2=new int[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				int b=random.nextInt(2);
				tab1[i][j]=b;
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				tab2[i][j]=tab1[i][j];
			}
		}
		System.out.println("nombre de eteration:");
		E=lire.nextInt();
		for(int a=0;a<E;a++) {
		
		for(int k=1;k<N-1;k++) {
			for(int t=1;t<M-1;t++) {
				co=0;
				if(tab1[k-1][t]==1) {
				co++;
				}
				if(tab1[k][t-1]==1) {
					co++;
				}
				if(tab1[k+1][t]==1) {
						co++;
				}
				if(tab1[k][t+1]==1) {
					co++;
				}
				if(tab1[k-1][t-1]==1) {
					co++;
				}
				if(tab1[k+1][t-1]==1) {
					co++;
				}
				if(tab1[k+1][t+1]==1) {
					co++;
				}
				if(tab1[k-1][t+1]==1) {
					co++;
				}
				switch(co) {
				case 3:
					if(tab1[k][t]==0) {
						tab2[k][t]=1;
					}
					if(tab1[k][t]==1) {
						tab2[k][t]=tab1[k][t];
					}
				break;
				case 2:
					if(tab1[k][t]==1) {
						tab2[k][t]=1;
					}
					if(tab1[k][t]==0) {
						tab2[k][t]=0;
					}
				break;
				default:
					tab2[k][t]=0;
				}
				
				
				
				/*if(co==3) {
					if(tab1[k][t]==0) {
						tab2[k][t]=1;
					}
					if(tab1[k][t]==1) {
						tab2[k][t]=tab1[k][t];
					}
				}
				if(co==2) {
					if(tab1[k][t]==1) {
						tab2[k][t]=tab1[k][t];
					}
					if(tab1[k][t]==0)
					
					
				}*/
				}
			
		}
		
		/*for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(tab1[i][j]+" ");
			}
			System.out.println();
		}*/
		System.out.println();
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(tab2[i][j]+" ");
			}
			System.out.println();
		}
		tab1=tab2;
		
	}
		// TODO Auto-generated method stub

	}

}
