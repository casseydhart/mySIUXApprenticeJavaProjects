package overridingsuperclassmethods;

public class Rectangle
{
	private double length;
	private double width;
	
	/**
	 * Sets length and width of rectangle
	 */
	
	public void setRectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	/**
	 * Returns length and width as string
	 */
	
	public String toString()
	{
		return "Length: " + length + "\nWidth: " + width;
	}
}
