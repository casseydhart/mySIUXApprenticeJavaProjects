package tryandcatchblock;

import java.util.*;

public class ExceptionExample
{
	public static void main(String[] args)
	{
		int dividend, divisor,quotient;
		
		// Create a Scanner object to read input.
		Scanner console = new Scanner(System.in);
		
		try
		{
			System.out.print("Enter the dividend: ");
			dividend = console.nextInt();
			
			System.out.print("Enter the divisor: ");
			divisor = console.nextInt();
			
			quotient = dividend / divisor;
			System.out.println("Quotient = " + quotient);
		}
		catch (ArithmeticException ex)
		{
			System.out.println("Exception: " + ex.toString());
		}
		catch (InputMismatchException ex)
		{
			System.out.println("Exception: " + ex.toString());
		}
	}
}
