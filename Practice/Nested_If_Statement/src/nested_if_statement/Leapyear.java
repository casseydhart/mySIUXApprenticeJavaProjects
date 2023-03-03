package nested_if_statement;	//	Needed for Scanner object

import java.util.Scanner;

/**
 * This program demonstrates a nested if statement.
 */

public class Leapyear 
{

	public static void main(String[] args) 
	{
		int year;	// holds a year
		
		//	Create a Scanner object for keyboard input.
		Scanner console = new Scanner (System.in);
		
		//	Get the year.
		System.out.print("Enter a year: ");
		year = console.nextInt();
		
		//	Determine whether the year is leap year.
		if (year % 4 == 0)
		{
			if (year % 100 ==0)
			{
				if (year % 400 ==0)
				{
					System.out.println("A leap year ");
				}
				else
				{
					System.out.println("Not a leap year ");
				}
			}
			else
			{
				System.out.println("A leap year ");
			}
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}
}