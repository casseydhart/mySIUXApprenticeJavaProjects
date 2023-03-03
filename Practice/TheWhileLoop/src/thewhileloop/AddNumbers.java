package thewhileloop;
/**
 * This program demonstrat sentinel
 * controlled while loop
 */
import java.util.Scanner;
public class AddNumbers 
{

	public static void main(String[] args)
	{
		int value;		//	to hold numbers
		int sum = 0;	//	initialize the sum
		
		//	Create a Scanner object for keyboard input.
		
		Scanner console = new Scanner(System.in);
		
		//	Get the first value.
		System.out.print("Enter first integer(enter 0 to quit): ");
		value = console.nextInt();
		
		while (value !=0)
		{
		
			//	Add value to sum
			sum = sum + value;
			
			//	Get the next value from the user
			System.out.print("Enter next integer(enter 0 to quit): ");
			value = console.nextInt();
		}
		
		//	Display the total.
		System.out.println("Sum of the integers:" + sum);


	}

}
