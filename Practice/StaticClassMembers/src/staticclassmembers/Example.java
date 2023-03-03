package staticclassmembers;
/**
 * This class demonstrates a static field
 */
public class Example 
{
	private static int staticField = 0;
	private int instanceField;
	
	/**
	 * The constructor increments the static field and
	 * initialize instance field
	 */
	
	public Example(int i)
	{
		instanceField = i;
		staticField++;
	}
	
	/**
	 * The show method display the value 
	 * in the staticField and instanceField
	 */
	public void show()
	{
		System.out.println("Value of Static Field " + staticField + "\nValue of instance Field " + instanceField);
	}

}
