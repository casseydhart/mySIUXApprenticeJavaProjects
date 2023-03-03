package usingstringmethod;
/**This program demonstrates
 * length String methods
 */
public class StringLengthDemo 
{

	public static void main(String[] args) 
	{
		String message;		//	To hold a string
		int n;				//	To hold length of String
		
		message = "The Java Tutorials";
		n = message.length();
		System.out.println("The length of message: " + n);
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.concat(" For Beginners"));
		System.out.println(message.substring(4));
		System.out.println(message.substring(4,8));
	}

}
