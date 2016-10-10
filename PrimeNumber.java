import java.util.*;

public class PrimeNumber
{
	public static void isPrime(int inputNumber)
	{
		int n=inputNumber;
		if(n>1)
		{
			if((n/1==n||n/n==1)&&(n%2!=0&&n%3!=0&&n%4!=0&&n%5!=0))
			{
				System.out.println("the number is a prime number\n ");
			}
			else
			{
				System.out.println("the number is not a prime number\n ");
			}
		}
		else
			System.out.println("invalid entry\n");


	}



	public static void main(String[] args) 
	{
		long tst,tend;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number to be checked:\n");
		int inputNumber= scanner.nextInt();
		tst = System.currentTimeMillis();
		isPrime(inputNumber);
		tend = System.currentTimeMillis()-tst;
		System.out.println(tend+'s');

	}
}