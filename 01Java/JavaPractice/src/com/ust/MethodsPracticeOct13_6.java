package com.ust;
//Homework Question 3
//Write a looper method which accepts a string message and a number of loops.  
//Within the method use a while loop to outputs the message the entered number of times
public class MethodsPracticeOct13_6 {

	public static void main(String[] args) {
		looper("howdy", 3);
		looper("hi", 4);
	}
	// looper method accepts a string method and number of loops and iterates message and out put message looops
	//nbr of loopps (int parameter) and outputs msg in loop (void)
					//msg[msg "howdy"]        maxLoop[3]
	public static void looper(String msg, int maxLoop) {
		int idx = 0; //idx[3]
		while (idx < 3) { //idx < maxloop outputs "howdy"
			System.out.println("Hello");
			idx++;
		}
	}
}
