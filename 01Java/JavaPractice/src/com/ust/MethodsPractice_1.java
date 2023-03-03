package com.ust;
//Ex01:Write a program with a method named getTotal that accepts two integers as parameters and return their sum
	public class MethodsPractice_1 { 
		public static void main(String[] args) {
			// 4. invoke the method and handle result
			int sum = getTotal( 1, 2);
			System.out.println(sum);
		}
		 // 1. returns a sum     2. accepts to numbers
		 //            V                V      V
		public static int  getTotal( int a, int b) {
			// 3. logic adds and returns the sum of two numbers
			return a + b;
		}
	}