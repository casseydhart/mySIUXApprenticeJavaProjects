package creatingyourownexceptionclasses;

public class RectangleDemo 
{

	public static void main(String[] args) 
	{
		try
		{
			// Create a Rectangle object negative values
			Rectangle rectangle = new Rectangle(-3.5, 4.2);
			
			System.out.println("Area of Rectangle is " + rectangle.getArea());
		}
		catch (NegativeValueException ex)
		{
			ex.printStackTrace();
		}
	

	}

}
