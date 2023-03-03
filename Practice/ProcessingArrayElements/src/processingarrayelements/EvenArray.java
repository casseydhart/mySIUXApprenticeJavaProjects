package processingarrayelements;
/**
 * This program displays even values
 * of array.
 */
public class EvenArray 
{

	public static void main(String[] args) 
	{
		int[] list = {2, 5, 16, 18, 21};
		
		// Display all even elements of array
		System.out.println("The even numbers of array:");
		
		for (int i = 0; i < list.length; i++)
		{
			if (list[i] % 2 == 0)
			{
				System.out.print(list[i] + " ");
			}
		}
		
		System.out.println();
	}

}
