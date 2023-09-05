package com.abisha.ticket;

public class booking {
	@Override
	public String toString() {
		return "booking [name=" + name + ", place=" + place + "]";
	}
	static int no_of_tickets = 10;
	private String name, place;
	int example(String name, String place)
	{
		this.name = name;
		this.place = place;
		no_of_tickets --;
		return no_of_tickets;
	}

}
