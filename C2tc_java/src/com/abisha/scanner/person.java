package com.abisha.scanner;

public class person {
	@Override
	public String toString() {
		return "person [name=" + name + ", income=" + income + ", tax=" + tax + "]";
	}
	private String name;
	public String getName() {
		return name;
	}
	public int getIncome() {
		return income;
	}
	public int getTax() {
		return tax;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private int income;
	public void setIncome(int income) {
		this.income = income;
	}
	
	private int tax;
	public void setTax(int tax) {
		this.tax = tax;
	}
	
}
