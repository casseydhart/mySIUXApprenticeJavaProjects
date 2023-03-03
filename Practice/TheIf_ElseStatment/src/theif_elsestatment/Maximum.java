package theif_elsestatment;

import java.util.Scanner;		//	Needed for Scanner class
/**
 * This program demonstrates the if-else statement.
 */

public class Maximum 
{

	public static void main(String[] args) 
	{
		int number1, number2;		//	store two numbers
		int max;					//	store maximum of the numbers
		
		//	Create a Scanner object to read input.
		Scanner console = new Scanner(System.in);
		
		//Get two numbers from the users.
		System.out.print("Enter and integer: ");
		number1 = console.nextInt();
		System.out.print("Enter another integer: ");
		number2 = console.nextInt();
		
		//	Determine maximum of two;
		if (number1 > number2)
		{
			max = number1;
		}
		else
		{
			max = number2;
		}
		System.out.println("Maximum number is " + max);			
	}

}
