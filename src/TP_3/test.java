package TP_3;
import java.net.*;
import java.io.*;
public class test extends Thread {
	private int value ; 
	private int nbIterations ; 
	public test (int value, int nbIterations) { 
	this.value = value; 
	this.nbIterations = nbIterations;
	 } 
	public void run(){ 
	for (int i=1; i<=nbIterations; i++) 
	System.out.print(value + " ");
	 } 

	public static void main(String [] args) throws InterruptedException { 
	Thread un = new test(1,30) ; 
	Thread zero = new test(0,30); 
	un.start();
	
	zero.start();
	zero.join();
	
	
	 } 

	
	


	
		}

