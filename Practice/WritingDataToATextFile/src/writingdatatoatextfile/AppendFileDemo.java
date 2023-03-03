package writingdatatoatextfile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendFileDemo 
{

	public static void main(String[] args) throws IOException
	{
		// Open the file in append mode.
		FileWriter fw  =  new FileWriter ("C:\\Workspace\\10.1 Introduction to File Input and Output\\oceans.txt", true);
		PrintWriter out = new PrintWriter(fw);
		
		// Append the name of ocean to the file
		out.println("Southern");
		
		// Close the file.
		out.close();

	}

}
