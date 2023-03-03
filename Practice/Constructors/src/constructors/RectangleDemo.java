package constructors;
/**
 * This program tests Rectangle class 
 */

public class RectangleDemo 
{

	public static void main(String[] args) 
	{
		//	Create a Rectangle object with default values
		
		Rectangle rectangle1 = new Rectangle();
		
		System.out.println("Area of Rectangle is " + rectangle1.getArea());
		System.out.println("Perimeter of Rectangle is " + rectangle1.getPerimeter());
		
		//	Create a Rectangle object with given set of values
		
		Rectangle rectangle2 = new Rectangle(3.5, 4.2);
		
		System.out.printf("Area of Rectangle is %.1f ", rectangle2.getArea());
		System.out.println("\nPerimeter of Rectangle is " + rectangle2.getPerimeter());

	}

}
