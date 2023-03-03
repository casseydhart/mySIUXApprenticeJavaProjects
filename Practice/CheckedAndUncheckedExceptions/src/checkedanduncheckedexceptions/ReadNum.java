package checkedanduncheckedexceptions;

import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadNum 
{

	public static void main(String[] args) throws IOException
	{
		try (Scanner inFile = new Scanner(new FileReader("C:\\Workspace\\Eclipse Work\\11.5 Checked and Unchecked Exceptions\\sample.txt")))
		{
			int num1 = inFile.nextInt();
			int num2 = inFile.nextInt();
			
			int sum = num1 + num2;
			
			System.out.println("sum " + sum);
		}
		catch (IOException | InputMismatchException ex)
		{
			System.out.println(ex.toString());
		}

	}

}
