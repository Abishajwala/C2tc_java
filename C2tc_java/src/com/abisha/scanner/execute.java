package com.abisha.scanner;
import java.util.*;

public class execute {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter ur Name : ");
		String name = obj.nextLine();
		
		System.out.println("Enter ur Income : ");
		int income = obj.nextInt();
		
		person P1 = new person();
		P1.setName(name);
		P1.setIncome(income);
		
		calculate c1 = new calculate();
		c1.calc(P1);
		System.out.println("Tax calculation for ur income: ");
		System.out.println(P1);

	}

}
