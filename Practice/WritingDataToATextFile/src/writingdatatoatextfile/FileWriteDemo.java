package writingdatatoatextfile;
import java.io.IOException;
import java.io.PrintWriter; // Step 1
import java.io.IOException;

public class FileWriteDemo 
{
	public static void main(String[] args) throws IOException
	{
		// Open the file
		PrintWriter out = new PrintWriter("C:\\Workspace\\10.1 Introduction to File Input and Output\\oceans.txt");	// Step 2
		
		// Write the name of four oceans to the file 
		out.println("Atlantic");	// Step 3
		out.println("Pacific");
		out.println("Indian");
		out.println("Arctic");
		
		// Close the file
		out.close(); 	// Step 4
	}
}
