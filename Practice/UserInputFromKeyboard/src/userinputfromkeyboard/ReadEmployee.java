package userinputfromkeyboard;
/**
 * This program demonstrates various Scanner methods.
 */
import java.util.Scanner;
public class ReadEmployee 
{

	public static void main(String[] args) 
	{
		String name;	//	To hold the employee's name
		int age;	//	To hold the employee's age
		char gender;	//	To hold the employee's gender
		double salary;	//	To hold the employee's salary
		
		//	Create a Scanner object to read input.
		Scanner console = new Scanner(System.in);
		
		//	Get the employee's name
		System.out.print("Enter name: ");
		name = console.nextLine();
		//	Get the employee's age
		System.out.print("Enter age: ");
		age = console.nextInt();
		
		//	Get the employee's gender
		System.out.print("Enter gender: ");
		gender = console.next().charAt(0);
		
		//	Get the employee's salary
		System.out.print("Enter salary: ");
		salary = console.nextDouble();
		
		//	Display the information
		System.out.println("Name: " + name +" " + "Age: " + age + " " + "Gender: " + gender + " " + " Salary: " + salary + " ");
	}

}
