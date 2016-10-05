import java.util.*;
import java.lang.*;
import java.io.*;


public class power
{
	public static void powerMethod(int b,int p)
	{	
		if(p==0)
		{
			System.out.println("the answer is 1\n");
		}

		else if (p==1)
		{
			System.out.println("the answer is :"+b+" ");
		}
		else 
		{	
			double tb=(double)b;

			for(int i=2;i<=p;i++)
			{
				tb=tb*b;
			}

			System.out.println("the answer is :"+tb +" ");
		}
		
	}

	public static void main(String[] args) 

	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the base :\n");
		int BASE = scanner.nextInt();	
		System.out.println("enter the power to be raised to:\n");
		int POWER = scanner.nextInt();
		powerMethod(BASE,POWER);
	}
}