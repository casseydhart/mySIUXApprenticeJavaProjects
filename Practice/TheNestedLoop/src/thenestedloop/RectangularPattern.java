package thenestedloop;
/**
 * This program displays a rectangular pattern
 *	of stars
 */
public class RectangularPattern 
{

	public static void main(String[] args) 
	{
		final int	MAXROWS = 4,
					MAXCOLS	= 5;
					
		for (int i = 1; i <= MAXROWS; i++)
		{
			for (int j = 1; j <= MAXCOLS; j++)
			{
				System.out.print("*");
			}
				System.out.println();
		}
				
	}

}
