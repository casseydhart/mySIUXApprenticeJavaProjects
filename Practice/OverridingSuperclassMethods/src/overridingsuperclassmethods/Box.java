package overridingsuperclassmethods;

public class Box extends Rectangle
{
	private double height;
	
	/**
	 * Sets length, width and height of box. 
	 */
	
	public void  setBox(double length, double width, double height)
	{
		setRectangle(length, width);
		this.height = height;
	}
	
	/**
	 * The toString method overrides the Rectangle's toString method
	 * and returns length, width and height of box as string
	 */
	
	public String toString()
	{
		return super.toString() + // Calling Rectangle's toString method
				"\nHeight: " + height;
	}

}
