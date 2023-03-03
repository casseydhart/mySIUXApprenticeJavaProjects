package progammingexercises_arraysandarraylists_ADP;
/**
 * Write Java statements that do the following:
 * a) Declare an array numArray of 15 elements of type int.
 * b) Output the value of the tenth element of the array alpha.
 * c) Set the value of the fifth element of the array alpha to 35.
 * d) Set the value of the ninth element of the array alpha to the sum of 
 * the sixth and thirteenth elements of the array alpha.
*/

public class Question_1 
{

	public static void main(String[] args)
	{
		//Declare an array numArray of 15 elements of type int
		 int[] numArray = new int[15];
		        
		 //Output the value of the tenth element of the array alpha.
		 System.out.println(alpha[9]);
		        
		 //Set the value of the fifth element of the array alpha to 35.
		 alpha[4] = 35;
		        
		 //Set the value of the ninth element of the array alpha to the sum of 
		 //the sixth and thirteenth elements of the array alpha
		 alpha[8] = alpha[5] + alpha[12];

	}

}
