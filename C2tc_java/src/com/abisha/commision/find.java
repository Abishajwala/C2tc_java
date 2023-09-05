package com.abisha.commision;
import java.util.Scanner; 

import com.abisha.scanner.person;

public class find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter ur Name : ");
		String name = obj.nextLine();
		
		System.out.println("Enter ur Adress : ");
		String Address = obj.nextLine();
		
		System.out.println("Enter ur Phone : ");
		Long Phone = obj.nextLong();
		
		System.out.println("Enter ur Sales amount : ");
		int salesamt = obj.nextInt();
		
		employee E1 = new employee();
		E1.setName(name);
		E1.setAdress(Address);
		E1.setPhone(Phone);
		E1.setSales_amount(salesamt);
		
		calculate C1 = new calculate();
		C1.calculation(E1);
		System.out.println("Comission calculated for your sales amount is : ");
		System.out.println(E1);
	}

}
