package com.abisha.inter;

public class bankdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b = new bankImp();
		account a = new account(12376, "madhu", 15550,b);
		a.deposit(2000);
		System.out.println(a);
		
		a.withdraw(10000);
		System.out.println(a);
		
	}
	}

