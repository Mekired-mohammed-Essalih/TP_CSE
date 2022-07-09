package TP_3;

import java.util.Scanner;

public class mssc_tp1 {
        static int x,z,s;
        static int[] tab1=new int[50];
        static int[] tab4=new int[8];
        static String w;
        static char r;
        static int[] tab2=new int[50];
	public static void main(String[] args) throws Exception {
		for(int r=0;r<8;r++) {
			tab4[r]=0;
		}
		Scanner in=new Scanner(System.in);
		System.out.println("entrez la bse:");
		s=in.nextInt();
		w=Integer.toBinaryString(s);
		StringBuilder b=new StringBuilder(w);
		b=b.reverse();
		for(int t=0;t<b.length();t++) {
			r=b.charAt(t);
			String u=String.valueOf(r);
			int k=Integer.parseInt(u);
			tab4[t]=k;
		}
		System.out.println(w);
		for(int j=0;j<50;j++) {
			tab1[j]=0;
		}
		pointer p1 =new pointer(000,tab4[0]);
		pointer p2 =new pointer(001,tab4[1]);
		pointer p3 =new pointer(010,tab4[2]);
		pointer p4 =new pointer(011,tab4[3]);
		pointer p5 =new pointer(100,tab4[4]);
		pointer p6 =new pointer(101,tab4[5]);
		pointer p7 =new pointer(110,tab4[6]);
		pointer p8 =new pointer(111,tab4[7]);
		pointer tab3[]= {p1,p2,p3,p4,p5,p6,p7,p8};
		
		tab1[24]=1;
		for(int j=0;j<50;j++) {
			System.out.print(" "+tab1[j]);
		}
		System.out.println();
		
		for(int n=0;n<50;n++) {
		for(int i=0;i<50;i++) {
			if(i==0) {
			x=tab1[49]*100+tab1[i]*10+tab1[i+1];
			for(int j=0;j<8;j++) {
				if(x==tab3[j].x) {
					z=tab3[j].y;
				}
			}
			tab2[i]=z;
			}else {
			if(i==49) {
				x=tab1[48]*100+tab1[i]*10+tab1[0];
				for(int j=0;j<8;j++) {
					if(x==tab3[j].x) {
						z=tab3[j].y;
					}
				}
				tab2[i]=z;	
			}else {
			x=tab1[i-1]*100+tab1[i]*10+tab1[i+1];
			for(int j=0;j<8;j++) {
				/*if(i==22){
				System.out.println("x="+x);}*/
				if(x==tab3[j].x) {
					z=tab3[j].y;
				}
			}
			tab2[i]=z;
			
			
			
		// TODO Auto-generated method stub

	}
			}
		}
		for(int m=0;m<50;m++) {
			System.out.print(" "+tab2[m]);
		}
		System.out.println();
		for(int p=0;p<50;p++) {
		tab1[p]=tab2[p];}
		}

}
}