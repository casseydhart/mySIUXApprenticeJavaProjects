package thebreakandcontinuestatement;
/**
 * This program demonstrates continue
 *to skip remaining statements of iteration.
 */
public class ContinueDemo 
{

	public static void main(String[] args) 
	{
		for (int i = 1; i<=10; i++)
		{
			if (i% 2 == 0)
			{
				continue;		//	skip next statement if i is even
		}
			System.out.println(i + " ");
		}
	}

}
