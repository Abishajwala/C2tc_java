package com.abisha.multilevel;

public class haunted_house extends Attraction
{
	int age_limit;
	public haunted_house(String s, double t, int a)
	{
		super(s,t);
		age_limit = a;
	}
	void display()
	{
		super.display();
		System.out.println("minimum Age limit: "+ age_limit);
	}

}
