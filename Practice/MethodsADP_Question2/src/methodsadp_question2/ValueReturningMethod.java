package methodsadp_question2;
/**
 * Write a value-returning method, isVowel that returns the value true if 
 * a given character is a vowel, and otherwise returns false. 
 * In main() method accept a string from user and count number of vowels in that string. *
 */

import java.util.Scanner;

public class ValueReturningMethod 
{

	public static void main(String[] args) 
	{
//		Create a Scanner object for keyboard input.
			Scanner console = new Scanner(System.in);
			String sentence;
			
			System.out.print("Enter a String: ");
			sentence = console.nextLine();
			
			int count = 0;
			
			for (int i=0; i <= sentence.length(); i++)
			{
				if (isVowel(sentence.charAt(i)))
				{
					count++;
				}
			} 
			System.out.println("Number of vowels" + count);
	}
	public static boolean isVowel(char letter)
	{
		switch(letter)
		{
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			return true;
			default:
				return false;
	}

	}

}
