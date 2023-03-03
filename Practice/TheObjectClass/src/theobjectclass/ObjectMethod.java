package theobjectclass;
/**
 * This program demonstrates the equals
 * methods that is inherited from the Object class.
 */
public class ObjectMethod 
{
	
	public static void main(String[] args) 
	{
		// Create two objects.
		Rectangle rectangle1 = new Rectangle(12, 15);
		Rectangle rectangle2 = new Rectangle(12, 15);
		
		// Test the equeals method.
		if (rectangle1.equals(rectangle2))
			System.out.println("The two are the same.");
		else
			System.out.println("The two are not the same");
	}

}
