package com.abisha.threads;

public class ExtendThread extends Thread{
	public void run()
	{
		System.out.println("Hurray!!..Thread is running.");
	}
	public static void main(String[] args) {
		
		ExtendThread t = new ExtendThread();
		t.start(); 	
		System.out.println("Inside main method");
		t.run();
	}
}
