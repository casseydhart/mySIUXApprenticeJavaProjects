package commonarrayoperations;

public class CommonArrayMehodsDemo
{

	public static void main(String[] args)
	{
		final int SIZE = 4;		// Size of the array
		
		// Create an array
		int[] array = new int[SIZE];
		
		// Read into array
		System.out.println("Enter numbers ");
		CommonArrayMethods.fillArray(array, SIZE);
		
		// Print the array.
		System.out.println("Numbers are:");
		CommonArrayMethods.printArray(array, SIZE);
		
		System.out.println();
		
		// Display the sum of the elements of array.
		System.out.println("The sum of the elements is: " + CommonArrayMethods.sumArray(array, SIZE));
		
		// Display the index of largest element of array
		System.out.println("Largest element is at index " + CommonArrayMethods.largestElement(array, SIZE));
	}

}
