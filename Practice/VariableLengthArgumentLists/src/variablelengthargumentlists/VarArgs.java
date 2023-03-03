package variablelengthargumentlists;
/**
 * This Program demonstrates 
 * variables length arguments.
 */
public class VarArgs 
{

	public static void main(String[] args) 
	{
		System.out.println("The sum of 5 and 10 is " + sum(5,10));
		System.out.println("The sum of 23, 78, and 56 is " + sum(23, 78, 56));
		System.out.println("The sum when no parameter is passed is " + sum());
		
		int[] numbers = {23, 45, 89, 34, 92, 36, 90};
		
		System.out.println("The sum of array is " + sum(numbers));
	}
	
	/**
	 * The sum method takes variable number of arguments
	 */
	
	public static int sum(int... list)
	{
		int total = 0;
				
		// add all the values in list array
		for (int i = 0; i < list.length; i++)
		{
			total += list[i];
		}
		return total;
		
	}

}
