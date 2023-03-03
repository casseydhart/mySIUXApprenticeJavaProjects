package arraylistobjectsandtheforeachloop;

import java.util.ArrayList;

/**
 * This program demonstrates foreach loop.
 *
 */
public class ForEachDemo 
{

	public static void main(String[] args) 
	{
		// Create an ArrayList.
		ArrayList<String> list = new ArrayList<>();
		
		// Add some values to the ArrayList.
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		for (String str: list)
		{
			System.out.println(str);
		}

	}

}
