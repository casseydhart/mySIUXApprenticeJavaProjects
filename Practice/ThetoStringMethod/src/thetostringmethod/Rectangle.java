package thetostringmethod;
/**
 * Rectangle class demonstrating toString method
 */
public class Rectangle 
{
	private double length;
	private double width;
	
	/**
	 * Constructor
	 */
	
	public Rectangle(double l, double w)
	{
		length = l;
		width = w;
	}
	
	/**
	 * The overriding toString method returns the
	 * string containing object's length and width
	 */
	
	public String toString()
	{
		return "length: " + length + "\nwidth: " + width;
	}
}
