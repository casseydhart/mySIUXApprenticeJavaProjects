package switchstatement;
import java.util.Scanner;	//	Needed for the Scanner class
/** 
 * This program demonstrates switch statement.
 */
public class WeekDay 
{

	public static void main(String[] args) 
	{
		int day;	//	to hold day value
		
		//	Create a Scanner object for keyboard input.
		Scanner console = new Scanner(System.in);
		
		//	Get day.
		System.out.print("Enter number 1-7: ");
		day = console.nextInt();
		
		//	Determine the corresponding week's day
		switch (day)
		{
		case 1:
			System.out.println("Sunday");
			break;
		
		case 2:
			System.out.println("Monday");
			break;
			
		case 3:
			System.out.println("Tuesday");
			break;
			
		case 4:
			System.out.println("Wednesday");
			break;
			
		case 5:
			System.out.println("Thrusday");
			break;
			
		case 6:
			System.out.println("Friday");
			break;
			
		case 7:
			System.out.println("Saturday");
			break;
			
		default:
			System.out.println("Invalid input");		
		}

	}

}
