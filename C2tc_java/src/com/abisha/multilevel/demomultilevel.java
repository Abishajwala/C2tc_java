package com.abisha.multilevel;

public class demomultilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---Theme Park---");
		Attraction obj = new Attraction("Magic show", 50);
		obj.display();
		Attraction obj1 = new rollercoaster("Roller coaster", 30, 7);
		obj1.display();
		Attraction obj2 = new haunted_house("Haunted house", 40, 18);
		obj2.display();
		Attraction obj3 = new foodstall("Pizza house", 15, "Mexican style");
		obj3.display();
	}

}
