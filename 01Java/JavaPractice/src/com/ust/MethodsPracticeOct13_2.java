package com.ust;

public class MethodsPracticeOct13_2 { //MyMath _1
		public static void main(String[] args) {
			MyMath mm = new MyMath();
			int result = mm.add( 1, 2);
			System.out.println( "result =" + result);
			double num = Math.floor( 2.9);
			System.out.println( "num =" + num);
		}
	}
	class MyMath {
		public int add( int a, int b) { return a + b; }
	}
