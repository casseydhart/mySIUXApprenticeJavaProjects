package protectedmember;
/**
 * This class Rectangle calculates
 * the area of rectangle
 */
public class Rectangle extends Shape
{
	/**
	 * The method returns the area 
	 * of rectangle
	 */
	
	public double getArea()
	{
		return height * width;	// accessing protected members
	}
}
