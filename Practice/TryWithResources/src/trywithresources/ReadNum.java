package trywithresources;

import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadNum 
{

	public static void main(String[] args)
	{
		try (Scanner inFile = new Scanner(new FileReader("C:\\Workspace\\Eclipse Work\\11.4 Try with resources\\sample.txt")))
		{
			int num1 = inFile.nextInt();
			int num2 = inFile.nextInt();
			
			int sum = num1 + num2;
			
			System.out.println("sum " + sum);
		}
		catch (IOException | InputMismatchException ex)
		{
			System.out.println("Error: " + ex.toString());
		}

	}

}
