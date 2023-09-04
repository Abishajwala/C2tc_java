package com.abisha.multilevel;

public class foodstall extends Attraction 
{
	String cuisine;
	public foodstall(String n, double t, String c)
	{
		super(n,t);
		cuisine = c;
	}
	void display()
	{
		super.display();
		System.out.println("Cuisine type : "+ cuisine);
	}
}
