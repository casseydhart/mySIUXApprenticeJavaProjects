package com.ust;
//Create a person w/ 2 Things the person can do & 1 attributes person has
public class ObjectsPracticeOct14_2 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.Name = "Karl";
		p1.run();
		p1.jump();
		
		Person p2 = new Person();
		p2.Name = "Lisa";
		p2.run();
		p2.jump();
	}
}		//separating the classes
	class Person { /// using a person class
		public String Name;
		public void run() {  
			System.out.println(Name + " " +"ran");
		}
		public void jump() {
			System.out.println(Name +" "+ "jumped");
		}
}
