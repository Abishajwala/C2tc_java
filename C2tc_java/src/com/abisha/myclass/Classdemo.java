package com.abisha.myclass;

public class Classdemo {

	public static void main(String[] args) {
		// without creating object static methods can be called.
				MyClass.display();
				MyClass ob = new MyClass();
				System.out.println(ob);
				MyClass.display();

	}

}
