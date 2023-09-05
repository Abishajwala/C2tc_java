package com.abisha.programs;
import java.util.*;
class Test {
	
	private String carname;
	private int price;
	
	public void check()
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter ur carname : ");
		carname = ob.nextLine();
		System.out.println("Enter ur carprice : ");
		price = ob.nextInt();
		System.out.println(carname);
		System.out.println(price);
		
	}
}
public class encapsulation
{
	public static void main(String args[])
	{
		Test e = new Test();
		e.check();
	}
}
