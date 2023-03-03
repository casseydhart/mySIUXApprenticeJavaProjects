package methodsadp_question1;
/**
 * Write a method named isEven that accepts an int argument. 
 * The method should return true if the argument is even, or false otherwise. 
 * Also write a program to test your method.
 * 
 * @author CasseyHart
 */
import java.util.Scanner;

public class IsEvenMethod 
{

	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		int number; 
		
		System.out.println("Enter number: ");
		number = console.nextInt();
		
		if(isEven(number))
		{
			System.out.println(number+ " is even");	
		}
		else
		{
			System.out.println(number + " is odd");
		}
	}
	
	public static boolean isEven(int number)

	{
		if(number % 2 == 0)
		{
		return true;
		}
		else
		{
			return false;
		}	
	}

}
