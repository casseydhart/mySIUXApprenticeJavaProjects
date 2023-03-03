package returningarrayfrommethods;
/**
 * This program demonstrates how a reference to an
 * array can be returned from a method.
 */
public class ReturnArray 
{

	public static void main(String[] args) 
	{
		final int NUMBER = 4;	// number of the elements
		
		// Create an array variable.
		int[] values;
		
		// Values reference the array returned
		// from the randomArray method.
		values = randomArray(NUMBER);
		
		// Display the values in the array.
		for (int i = 0; i < values.length; i++)
		{
			System.out.print(values[i] + " ");
		}
	}
	
	/**
	 * The randomArray method accept number as argument and 
	 * returns a reference to an array of integers
	 */
	
	public static int[] randomArray(int n)
	{
		int [] list = new int[n];
		
		for (int i = 0; i < list.length; i++)
		{
			list[i] = (int) (Math.random() * 10);
		}
		
		return list;
	}

}
