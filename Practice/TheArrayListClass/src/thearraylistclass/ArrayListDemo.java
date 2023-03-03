package thearraylistclass;

import java.util.ArrayList;

/**
 * This program demonstrates an ArrayList
 * add its methods
 */
public class ArrayListDemo 
{

	public static void main(String[] args)
	{
		// Create an array list.
		ArrayList<String> list = new ArrayList<>();
		
		// Display the size of the array list.
		System.out.println("Initial size of list: " + list.size());
		
		// Add elements to the array list.
		list.add("Sunday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.add("Thursday");
		list.add("Friday");
		list.add("Saturday");
		
		// Now insert an item at index 1.
		list.add(1, "Monday");
		
		// Display the size of the array list. 
		System.out.println("Size of the list after additional: " + list.size());
		
		// Display the array list.
		System.out.println("Contents of list: " + list);
		
		// Remove elements from the array list.
		list.remove("Saturday");
		
		// Display the array list.
		System.out.println("Contents of list: " + list);
		
		// Now remove the item at index 2.
		list.remove(2);
		
		// Display the array list
		System.out.println("Contents of list: " + list);
	}

}
