package com.abisha.inter;

public class bankImp implements bank
{
	@Override
	public void deposit(account account, double amount) {
		// TODO Auto-generated method stub
		if(amount>DEPOSIT_LIMIT)
		{
			System.out.println("deposit not possible");
		}
		else
		{
			account.setBalance(account.getBalance()+amount);
		}
	}
	@Override
	public void withdraw(account account, double amount) {
		// TODO Auto-generated method stub
		if(account.getBalance()-amount>=MIN_BALANCE)
		{
			account.setBalance(account.getBalance()-amount);
			System.out.println("Withdraw " +amount+" from account "+ account.getAccNo());
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}

}
	
