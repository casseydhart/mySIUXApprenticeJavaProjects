package finallyblock;

import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ReadNum
{
	private static Object infile;
	public static void main(String[] args) throws IOException
	{
		try

		{
			Scanner inFile = new Scanner(new FileReader("C:\\Workspace\\Eclipse Work\\11.3 Finally Block\\sample.txt"));
			int num1 = inFile.nextInt();
			int num2 = inFile.nextInt();
			int sum = num1 + num2;
			System.out.println("Sum: " + sum);
		}
		catch (IOException | InputMismatchException ex)
		{
			System.out.println("Error: " + ex.toString());
		}
		finally
		{
			if(infile != null)
				((Closeable) infile).close();
		}
	}
}
