

import java.util.*;
import java.io.*;
import java.lang.*;

public class primenumber2
{

		public static void isprimenumber(int a,int b)
		{
			
				ArrayList <Integer> al = new ArrayList<Integer>();

			
				int flag =0;
				for(int i=a;i<b;i++)
				{
					boolean isPrime = false;

					for(int j=2;j<i;j++)
					{
						if(i%j==0)
						{
							isPrime = true; 
							break;
						}
					}
					

						if(!isPrime)
						{
							al.add(i);
						}


				}
				display(al);
		}


		public static void display(ArrayList <Integer> al )
		{
			for(int l:al)
			System.out.println(l+" ");
		}

	public static void main(String[] args) 

	{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the range:");
			int a=sc.nextInt();
			int b = sc.nextInt();
			isprimenumber(a,b);
			



	}
} 



