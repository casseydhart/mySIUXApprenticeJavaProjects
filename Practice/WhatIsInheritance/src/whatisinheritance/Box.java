package whatisinheritance;

public class Box extends Rectangle
{
	private double height; 	//	To hold height
	
	/**
	 * Sets length, width and height of box 
	 */
	
	public void setBox(double length, double width, double height)
	{
		// Call the inherited setRectangle method
		// to set length and width of box.
		setRectangle(length, width);
		this.height = height;
	}
	
		/**
		 * Returns volume of cube
		 */
	public double getVolume()
	{
		// Call the inherited getArea method
		return getArea() * height;
	}
}
