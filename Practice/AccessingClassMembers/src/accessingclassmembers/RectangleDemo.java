package accessingclassmembers;
/**
 * This program test the Rectangle
 * class methods.
 */

public class RectangleDemo 
{

	public static void main(String[] args) 
	{
		//	Create a Rectangle object
		Rectangle rectangle1 = new Rectangle();
		
		//	Accessing class members
		rectangle1.set(4.2, 6.2);
		System.out.printf("Area of Rectangle is %.2f" , rectangle1.getArea());
		
		System.out.println("\n"+ "Perimeter of Rectangle is " + rectangle1.getPerimeter());
	}
}
