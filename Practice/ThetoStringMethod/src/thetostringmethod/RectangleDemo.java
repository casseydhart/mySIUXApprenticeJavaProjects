package thetostringmethod;
/**
 * This program demonstrate Rectangle's 
 * class toString method.
 */
public class RectangleDemo 
{

	public static void main(String[] args)
	{
		// Create a Rectangle object with given set of values
		
		Rectangle rect = new Rectangle(3.5, 4.2);
		
		// Display the object's values.Calling toString method implicitly
		
		System.out.println(rect);
	}

}
