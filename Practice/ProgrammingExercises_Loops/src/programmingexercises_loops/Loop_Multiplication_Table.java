package programmingexercises_loops;
/**Write a program that prompts the user to input a positive integer. 
 * It should then print the multiplication table of that number.
 */
import java.util.Scanner;

public class Loop_Multiplication_Table 
{

	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		System.out.print("Enter number: ");
		int factor = console.nextInt();
		for (int i = 1; i <= 100; i++)
		{
			System.out.println(factor + " * " + i + " = " + factor * i );
		}
	}

}
