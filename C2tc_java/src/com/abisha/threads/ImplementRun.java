package com.abisha.threads;

public class ImplementRun implements Runnable{

	public void run()
	{
		System.out.println("Implementing runnable interface.");
		for(int i=0; i<3; i++)
		{
			System.out.println(i + "from Thread ");
		}
	}
	public static void main(String[] args)
	{
		ImplementRun t = new ImplementRun();
		Thread t1 = new Thread(t);
		t1.start();
		System.out.println("Inside main Thread");
		for(int i=0; i<3; i++)
		{
			System.out.println(i + "from Main" + t1.getName());
		}
		
	}
}
