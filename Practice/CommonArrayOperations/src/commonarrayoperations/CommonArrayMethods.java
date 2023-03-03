package commonarrayoperations;
/**
 * This class contains common methods to
 * manipulate array.
 */

import java.util.Scanner;

public class CommonArrayMethods 
/**
 * The fillArray method accepts an array and number of
 * elements as an argument. Each of its Element is filled by user.
 */
{

	public static void fillArray(int[] list, int n) 
	{
		// Create a Scanner object for keyboard input.
		Scanner console = new Scanner(System.in);
		
		for (int i = 0; i < n; i++)
		{
			list[i] = console.nextInt();
		}
	}
	
	/**
	 * The printArray method accepts an array and a number of 
	 * elements as argument and displays its contents
	 */
	
	public static void printArray(int[] list, int n)
	{
		for (int i = 0; i < n; i++)
		{
			System.out.print(list[i] + " ");
		}
	}
	
	/**
	 * The sumArray method adds the sum of elements and return it.
	 */
	
	public static int sumArray(int[] list, int n)
	{
		int sum = 0;
		
		for(int i = 0; i < n; i++)
		{
			sum += list[i];
		}
		return sum;
	}
	
	/**
	 * The largestElement method returns the index of largest element.
	 */
	
	public static int largestElement(int[] list, int n)
	{
		int max = 0;	// store index number of first element
		
		for (int i = 1; i < n; i++)
		{
			if (list[max] > list[i])
			{
				max = i;
			}
		}
		return max;			
	}

}
