package com.abisha.inter;

public class account {
	private int accNo;
	private String Name;
	private double balance;
	private bank b;
	
	public account(int accNo, String name, double balance, bank b)
	{
		super();
		this.accNo = accNo;
		Name = name;
		this.balance = balance;
		this.b = b;
	}
	public void deposit(double amount)
	{
		b.deposit(this, amount);
	}
	public void withdraw(double amount)
	{
		b.withdraw(this, amount);
	}
	public int getAccNo() {
		return accNo;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", Name=" + Name + ", balance=" + balance + ", b=" + b + "]";
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public bank getB() {
		return b;
	}

	public void setB(bank b) {
		this.b = b;
	}
	

}
