package protectedmember;
/**
 * This program demonstrates the Rectangle and
 * Triangle class, which inherits from the Shape class.
 */
public class TestProgram
{

	public static void main(String[] args) 
	{
		// Create object of Rectangle.
		Rectangle rectangle = new Rectangle();
		
		// Create object of Triangle.
		Triangle triangle = new Triangle();
		
		// Set values in rectangle object
		rectangle.setValues(5,4);
		
		// Set values in triangle object
		triangle.setValues(5,10);
		
		// Display the area of rectangle.
		System.out.println("Area of rectangle: " + rectangle.getArea());
		
		// Display the area of triangle.
		System.out.println("Area of triangle: " + triangle.getArea());
	}

}
