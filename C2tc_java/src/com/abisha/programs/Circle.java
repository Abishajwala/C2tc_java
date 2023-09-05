package com.abisha.programs;
import java.util.*;

public class Circle {
	//member variables
		public float PI = (float) 3.14;
		private int radius;
		private String colour;
		float area; 
		
		//member method - 1
		public void getInput()
		{
			Scanner sc  = new Scanner(System.in);
			System.out.println("Enter Circle radius : ");
			radius = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter ur fav colour for circle : ");
			colour = sc.nextLine();
		}
		
		//member method - 2
		public void calcArea()
		{
			area = PI*radius*radius;
			System.out.println("Area of circle = "+ area);
		}

		public static void main(String[] args) {
			
			Circle c1 = new Circle();
			c1.getInput();
			c1.calcArea();

		}

}
