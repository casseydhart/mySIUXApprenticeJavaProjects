package com.ust;
//Write a method named isEven that accepts an int parameter and returns true if the argument is even, or false otherwise
//if(a %2== 0) //says any divided by 2 will be even

public class MethodsPractice_5 {

	public static void main(String[] args) {
		
		boolean a = isEven(9); //API. Entrance. Calls for 'return even
		System.out.println("This value is even " + a);

	}
	public static boolean isEven(int a) {
		boolean even = (a%2 == 0);//Passing a t/f comparison
		// [9] false. Doesn't meet condition
		
		//if(a %2== 0) //says any divided by 2 will be even
		return even; //[evev #] true. Meets condition
	}
}
