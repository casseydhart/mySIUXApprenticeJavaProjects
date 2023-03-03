package staticclassmembers;
/**
 * Program to test the Example class.
 */
public class ExampleDemo 
{

	public static void main(String[] args) 
	{
		Example one =  new Example(3);
		
		System.out.println ("Value of one.show(): ");
		one.show();
		
		Example two = new Example(5);
		
		System.out.println("Value of two.show(): ");
		two.show();
	}

}
