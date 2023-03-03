package overridingsuperclassmethods;
/**
 * This program demonstrates the Box class.
 */
import java.util.Scanner;
public class BoxDemo
{

	public static void main(String[] args) 
	{
		double length, width, height;
		
		// Create a Scanner object for keyboard input.
		Scanner console = new Scanner(System.in);
		
		// Get the length of box.
		System.out.print("Enter the length of box: ");
		length = console.nextDouble();
		
		// Get the width of box.
		System.out.print("Enter the width of box: ");
		width = console.nextDouble();
		
		// Get the height of box.
		System.out.print("Enter the height of box: ");
		height =  console.nextDouble();
		
		// Create a box object.
		Box myBox = new Box();
		
		// Set the length, width and height of box.
		myBox.setBox(length, width, height);
		
		// Display the box details.
		System.out.println(myBox);
		

	}

}
