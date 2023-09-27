package com.abisha.inter;

public class bank {
	double MIN_BALANCE = 1000;
	double DEPOSIT_LIMIT = 25000;
	double INTREST_RATE = 7.8;
	
	void deposit(account account, double amount);
	void withdraw(account account, double amount);
}
