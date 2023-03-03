package com.ust;
//Ex02:Write a Java method to find the smallest number among three entered numbers
//Ex03:Write a Java method to compute the average of three numbers
public class MethodsPractice_2 {

	public static void main(String[] args) {
				int smallest = getSmallest( 4, 2, 9);
				int avg = getAverage( 1, 2, 3);
				System.out.println( "smallest=" + smallest);
				System.out.println( "avg=" + avg);
			}
			public static int getSmallest( int a, int b, int c) {  // a[4], b[2], c[9]
				int smallest = 99999;  // smallest[ 2]
				if (a < smallest)
					smallest = a;
				if (b < smallest)
					smallest = b;		
				if (c < smallest)
					smallest = c;
				return smallest;		// returns 2
			}
			public static int getAverage( int a, int b, int c) {
				int average = 0;    	// average[ 0]
				average = (a + b + c) / 3;
				return average;			//return [3]
			}
}