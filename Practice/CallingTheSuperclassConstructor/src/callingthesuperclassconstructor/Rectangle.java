package callingthesuperclassconstructor;
/**
 * This class holds data of a Rectangle.
 */
public class Rectangle 
{
	private double length;	// To hold length of rectangle
	private double width; 	// To hold width of rectangle
	
	/**
	 * The constructor initialize rectangle's 
	 * length and width default value 
	 */
	
	public Rectangle()
	{
		length = 0;
		width = 0;
	}
	
	/**
	 * The constructor accepts the rectangle's
	 * length and width
	 */
	
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	/**
	 * The getArea method returns the area of 
	 * the rectangle.
	 */
	
	public double getArea()
	{
		return length * width;
	}
}
