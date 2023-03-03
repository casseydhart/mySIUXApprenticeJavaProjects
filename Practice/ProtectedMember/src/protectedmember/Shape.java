package protectedmember;
/**
 * A class Shape that holds width and height
 * of any shape 
 */
public class Shape 
{
	protected double height; 	// To hold height.
	protected double width; 	// To hold width.
	
	/**
	 * The setValue method sets the data
	 * in the height and width field
	 */
	public void setValues(double height, double width)
	{
		this.height = height;
		this.width = width;
	}
}
