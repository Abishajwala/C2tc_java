package com.abisha.commision;

public class calculate {
	public void calculation(employee E)
	{
		int amt = E.getSales_amount();
		if(amt >= 100000)
		{
			E.setCommi((amt/100)*10);
		}	
		else if(amt>=50000 && amt<100000)
		{
			E.setCommi((amt/100)*5);
		}
		else if(amt>=30000 && amt< 50000)
		{
			E.setCommi((amt/100)*3);
		}
		else if(amt<30000)
		{
			E.setCommi(0);
		}
	}
}

