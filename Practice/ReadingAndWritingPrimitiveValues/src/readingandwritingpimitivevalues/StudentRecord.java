package readingandwritingpimitivevalues;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentRecord
{
	public static void main(String[] args) throws IOException
	{
		// declares and initialize the variables
		double test1, test2, test3;
		double average;
		String name;
		FileReader fr = new FileReader("C:\\Workspace\\10.4 Reading And Writing Primitive Values\\test.txt");
		Scanner inFile = new Scanner(fr);
		
		PrintWriter outFile = new PrintWriter("C:\\Workspace\\10.4 Reading And Writing Primitive Values\\testavg.txt");
		
		// Read till end of file 
		while (inFile.hasNext())
		{
			name = inFile.next();
			outFile.println("Student Name: " + name);
			
			test1 = inFile.nextDouble();
			test2 = inFile.nextDouble();
			test3 = inFile.nextDouble();
			
			outFile.printf("Test scores: %5.2f %5.2f %5.2f %n", test1, test2, test3);
			average = (test1 + test2 + test3) / 3;
			outFile.printf("Average test score: %5.2f %n", average);
			outFile.println();
		}
		
		inFile.close();
		outFile.close();
	}
}
