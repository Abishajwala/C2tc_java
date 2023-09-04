package com.abisha.multilevel;

public class Attraction {
	String name; 
	double Ticket_price;
	
	public Attraction(String n, double t)
	{
		name = n;
		Ticket_price = t;
	}
	void display()
	{
		System.out.println("Name : " + name);
		System.out.println("Ticket Price : "+ Ticket_price);
	}

}
