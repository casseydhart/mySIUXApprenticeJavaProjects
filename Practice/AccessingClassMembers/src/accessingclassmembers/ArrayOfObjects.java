package accessingclassmembers;
/**
 * This Program creates
 *an array of rectangles.
 */

import java.util.*;

public class ArrayOfObjects 
{

	public static void main(String[] args) 
	{
		// Create an array to hold rectangle's data.
		Rectangle[] rectangles = new Rectangle[5];
		double length;	// to hold length of rectangle
		double width;	// to hold width of rectangle
		
		// Create a Scanner object for keyboard input.
		Scanner console = new Scanner(System.in);
		Rectangle[] rectangles = new Rectangle[5];
		
		for (int i = 0; i < 5; i++)
		{
			System.out.print("Enter the length of Rectangle " + (i + 1) + " " );
			length = console.nextDouble();
			System.out.print("Enter the width of Rectangle " + (i+1) + ": ");
			width = console.nextDouble();
			rectangles[i] = new Rectangle(length, width);
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Area of Rectangles " + (i + 1) + ": " + rectangles[i].getArea())
		}
		
		
		

	}

}
