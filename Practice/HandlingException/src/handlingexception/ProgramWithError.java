package handlingexception;

public class ProgramWithError 
{
	public static void main(String[] args)
	{
		// Create an array with four elements.
		int[] numbers = {10, 20, 30, 40};
		
		// Attempt to read five elements.
		for(int i = 0; i <= 4; i++)
			System.out.println(numbers[i]);
	}
}
