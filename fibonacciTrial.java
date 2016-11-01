import java.util.*;

public class fibonacciTrial
{	
	public static int fibo(int n)
	{
		if(n==1)
			return 1;
		else if(n==2)
			return 1;
		else
			return fibo(n-1)+fibo(n-2);

	}


	public static void main(String[] args)
	{
		System.out.println("the fibonacci series is as below:\n");
		for(int i=28;i<35;i++)
		{
			System.out.println(fibo(i));
		}
	}
}