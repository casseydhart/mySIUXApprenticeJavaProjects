package localvariables;
/**
 * This program demonstrate local
 * variable of a method
 */
import java.util.Scanner; // Needed for the Scanner class

public class LocalVariable 
{

	public static void main(String[] args) 
	{
		//	Create a Scanner object for keyboard input.
		Scanner console = new Scanner(System.in);
		int		number1, number2;	//	Hold numbers
		
		//	Get number from users
		System.out.print("Enter first integer: ");
		number1 = console.nextInt();
		System.out.print("Enter second integer: ");
		number2 = console.nextInt();
		
		//	Call method to display sum
		sum(number1, number2);
	}
	
	/**
	 * The sum method accept two arguments.
	 */
	
	public static void sum(int num1, int num2)
	{
		int total;	//	local variable stores intermediate results.
		
		total = num1 + num2;
		System.out.println("Total: " + total);
	}

}
