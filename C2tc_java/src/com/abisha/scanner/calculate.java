package com.abisha.scanner;

public class calculate {
	public void calc(person P)
	{
		if(P.getIncome()<=16000)
		{
			P.setTax(0);
		}
		else if(P.getIncome()>16000 && P.getIncome()<= 500000)
		{
			P.setTax(5);
		}
		else
		{
			P.setTax(8);
		}
	}
}
