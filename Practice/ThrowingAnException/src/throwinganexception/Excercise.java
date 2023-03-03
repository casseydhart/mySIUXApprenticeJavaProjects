package throwinganexception;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Excercise 
{
	public static void main(String[] args)
	{
		try 
		{
			int squareSide = getSide();
			show(squareSide);
		}
		catch (InputMismatchException ex)
		{
			ex.printStackTrace();
		}
	}
	
	private static int getSide()
	{
		int side;
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter Side of Square: ");
		side = console.nextInt();
		
		if(side < 0)
		{
			throw new InputMismatchException("Positive number required");
		}
		return side;
	}
	private static void show(int side)
	{
		System.out.println("Side: " + side);
		System.out.println("Area: " + (side * side));
	}

}
