package userinputfromkeyboard;

import java.util.Scanner;

/**
 * This program demonstrates keyboard input.
 */
public class RectangleArea {

	public static void main(String[] args) {
		int length;		//	To hold rectangle's length.
		int width;		//	To hold rectangle's width.
		int area;		//	To hold rectangle's area.
		
		//	Create  a Scanner object to read input.
		Scanner console = new Scanner(System.in);
		
		//	Get length from the user
		System.out.print("Enter length ");
		length = console.nextInt();
		
		//	Get widt from the user
		System.out.print("Enter width ");
		width = console.nextInt();
		
		//	Calculate area.
		area = length * width;
		
		//	Display area
		System.out.println("The area of rectangle is " + area);
	}

}
