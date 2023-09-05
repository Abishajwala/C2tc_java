package com.abisha.ticket;
import java.util.*;

public class demomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		booking c = new booking();
		String input1, input2;
		Scanner sc= new Scanner(System.in); 
		
		System.out.println("Enter ur Name :");
		input1 = sc.nextLine();
		System.out.println("Enter ur Place :");
		input2 = sc.nextLine();
		int a = c.example(input1, input2);
		System.out.println(c);
		System.out.println("Tickets available: "+ a);
		

	}

}
