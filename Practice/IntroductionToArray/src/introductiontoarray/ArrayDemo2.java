package introductiontoarray;
/**
 * This program shows values being read into an array's
 * element and then displayed its sum
 */
import java.util.Scanner;

public class ArrayDemo2
{

	public static void main(String[] args) 
	{
		int size;
		
		// Create a Scanner object for keyboard input.
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		size = console.nextInt();
		
		// Create an array to hold integers.
		int[] list = new int[size];
		
		System.out.println("Enter" + list.length + "integers.");

		// Get integers.
		for (int i = 0; i < list.length; i++)
		{
			list[i] = console.nextInt();
		}
		
		int sum = 0;	// To hold total
		
		// Calculate the sum of elements.
		for (int i = 0; i < list.length; i++)
		{
			sum += list[i];
		}
		
		// Display the sume of array elements.
		System.out.println(" The sum of array: " + sum);
	}

}
