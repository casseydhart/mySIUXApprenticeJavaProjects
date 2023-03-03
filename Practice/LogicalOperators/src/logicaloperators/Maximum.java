package logicaloperators; 

import java.util.Scanner; //	Needed for the Scanner class
/**
 * This program demonstrates the logical &&  operator.
 */

public class Maximum 
{

	public static void main(String[] args) 
	{
		int num1, num2, num3;	// holds three integers
		int max;				// holds maximum value
		
		//	Create a Scanner object for keyboard input.
		Scanner console =  new Scanner(System.in);
		
		//	Get these intergers.
		System.out.print("Enter three integers: ");
		num1 = console.nextInt();
		num2 = console.nextInt();
		num3 = console.nextInt();
		
		//	Determine the maximum number
		if ((num1 > num2) && (num1 > num3))
		{
			max = num1;
		}
		else if (num2 > num3)
		{
			max = num2;
		}
		else
		{
			max = num3;
		}
		
		//	Display the maximum number
		System.out.println("Maximum is " + max);
		
	}

}
