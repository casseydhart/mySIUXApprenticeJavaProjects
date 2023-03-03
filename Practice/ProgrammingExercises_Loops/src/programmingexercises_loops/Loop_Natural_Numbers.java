package programmingexercises_loops;
/**Write a program to calculate the sum of first 10 natural number.
 * Show Answer
 */

public class Loop_Natural_Numbers 
{

	public static void main(String[] args) 
	{
		int num = 10;
		int sum = 0;
		
	for(int i = 1; i <= num; ++i)
	{
		sum += i;
	}
	System.out.println("Sum = " + sum);
	}

}
