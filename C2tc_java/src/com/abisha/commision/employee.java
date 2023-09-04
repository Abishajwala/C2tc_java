package com.abisha.commision;
import java.lang.*;
public class employee {
	@Override
	public String toString() {
		return "employee [Name=" + Name + ", Adress=" + Adress + ", Phone=" + Phone + ", Sales_amount=" + Sales_amount
				+ ", commi=" + commi + "]";
	}
	private String Name, Adress; 
	private Long Phone; 
	private int Sales_amount, commi;
	public int getCommi() {
		return commi;
	}
	public void setCommi(int commi) {
		this.commi = commi;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public Long getPhone() {
		return Phone;
	}
	public void setPhone(Long phone) {
		Phone = phone;
	}
	public int getSales_amount() {
		return Sales_amount;
	}
	public void setSales_amount(int sales_amount) {
		Sales_amount = sales_amount;
	}
	
	
	
}

