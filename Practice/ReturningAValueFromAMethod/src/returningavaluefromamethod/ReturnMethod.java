package returningavaluefromamethod;
/**
 * This program demonstrate a
 * value returning method
 */
import java.util.Scanner;

public class ReturnMethod 
{

	public static void main(String[] args) 
	{
		//	Create a Scanner object for keyboard input.
		Scanner console = new Scanner(System.in);
		int		number,		//	to hold the number
				x;			//	to hold the factorial
		
		//	Get the number.
		System.out.print("Enter number: ");
		number = console.nextInt();
		
		//	Call factorial method an return result to x.
		x = factorial(number);
		System.out.println("Factorial: " + x);
	}
	
	/**
	 * 	The factorial method accept a number
	 * 	and returns the factorial.
	 */
	
	public static int factorial(int num)
	{
		int fact = 1;
		for (int i = 1; i <= num; i++)
		{
			fact = fact * i;
		}
		return fact;
	}

}
