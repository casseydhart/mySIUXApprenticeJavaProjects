package themathclass;
/**
 * This program demonstrate
 * Class Math methods.
 */
public class MathMethodsDemo 
{

	public static void main(String[] args) 
	{
		//	To hold data.
		double x, y, result;
		x = 16;
		y = 2.0;
		
		//	Get the power.
		result = Math.pow(x, y);
		
		//Display result
		System.out.println(result);
				
		//	Get square root.
		result = Math.sqrt(x);
		
		//	Display result.
		System.out.println(result);
	}

}
