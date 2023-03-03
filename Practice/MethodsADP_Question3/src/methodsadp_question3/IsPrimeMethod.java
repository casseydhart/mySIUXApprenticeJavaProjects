package methodsadp_question3;
/**
 * A prime number is a number that is evenly divisible only by itself and 1. 
 * For example, the number 5 is prime because it can be evenly divided only by 1 and 5. 
 * The number 6, however, is not prime because it can be divided evenly by 1, 2, 4, and 6.
 * Write a method named isPrime, which takes an integer as an argument and returns true 
 * if the argument is a prime number, or false otherwise. 
 * Also write main method that displays prime numbers between 1 to 500.
 */
public class IsPrimeMethod 
{

	public static void main(String[] args) 
	{
		boolean result = isPrime(num : 397);
		System.out.println(result);
		
		for(int index = 1; index < 500; index++)
		{
			if (isPrime(index) == true)
			{
				System.out.println(index + " is prime");
			}
		}

	}
	public  static boolean isPrime(int num)
	{
		if(num < 2)
		{
			return false;
		}
		else
		{
			int check = num / 2;
			for(int i = 2; i < check; i++)
			{
				if (num % i == 0)
				{
					return false;
				}
			}
		}
		return true;
	}

}
