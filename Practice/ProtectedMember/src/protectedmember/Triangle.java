package protectedmember;
/**
 * This class Triangle calculates
 * the area of triangle
 */
public class Triangle extends Shape
{
	/**
	 * The method returns the area 
	 * of triangle
	 */
	
	public double getArea()
	{
		return height * width / 2; 	// accessing protected members
	}
}
