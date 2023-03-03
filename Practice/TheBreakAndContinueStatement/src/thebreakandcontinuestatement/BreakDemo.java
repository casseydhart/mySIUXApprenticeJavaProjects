package thebreakandcontinuestatement;
/**
 * This program demonstrates
 * break to exit a loop.
 */
public class BreakDemo 
{
	
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10; i++)
		{
			if (i==5)
			{
				break;		//	terminates loop if i is 5
			}
			System.out.print(i + " ");
		}
		System.out.println("Loop is over");
	}
}
