package accessingclassmembers;

public class Rectangle {

	private double length;
	private double width;
	
	/**
	 * The set method accepts two arguments
	 * which are stored in the length and width fields
	 */
	
	public void set(double l, double w)
	{
		length = l;
		width = w;
	}
	
	/**
	 * The getArea method computes and returns the area
	 */
	
	public double getArea()
	{
		return length * width;
	}
	
	/**
	 * The getPerimeter method computes and returns the perimeter
	 */
	
	public double getPerimeter()
	{
		return 2* (length + width);
	}

}

