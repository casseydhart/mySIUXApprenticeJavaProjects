package introductiontoarray;
/**
 * This program shows values being read in to an array's 
 * element and then display;
 */
import java.util.Scanner;	// Needed for Scanner class

public class ArrayDemo1 
{
	public static void main(String[] args) 
	{
		final int SIZE = 5; // size of array
		
		// Create an array to hold employee salary.
		double[] salaries = new double[SIZE];
			
		// Create a Scanner object for keyboard input.
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter the salaries of " + SIZE + " employees.");
		
		// Get employees' salary.
		for (int i = 0; i < SIZE; i++)
		{
			salaries[i] = console.nextDouble();
		}
		
		// Display the values stored in the array.
		System.out.println("The salaries are:");
		
		for (int i = 0; i < SIZE; i++)
		{
			System.out.println(salaries[i]);
		}
		
	}

}
