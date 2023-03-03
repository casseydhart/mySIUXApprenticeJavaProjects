package writingdatatoatextfile;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadDemo 
{

	public static void main(String[] args) throws IOException
	{
		// Open the file.
		FileReader fr = new FileReader("C:\\Workspace\\10.1 Introduction to File Input and Output\\oceans.txt");
		Scanner inFile = new Scanner(fr);
	
		// Read lines from the file till end of file
		/**while (inFile.hasNext())
		{
			// Read the next line.
			String line = inFile.nextLine();*/
			
			String line;
			
			// Read the first line from the file.
			line = inFile.nextLine();
			
			
			// Display the line.
			System.out.println(line);
			
			//Read second line from the File.
			line = inFile.nextLine();
			
			// Display the line.
			System.out.println(line);
				
			// Close the file.
			inFile.close();
		
		/**String line;
		
		// Read the first line from the file.
		line = inFile.nextLine();
		
		// Display the line
		System.out.println(line);
		
		// Read second line from the file.
		line = inFile.nextLine();
		
		// Display the line.
		System.out.println(line);
		
		// Close the file.
		inFile.close();*/
		
		

	}

}
