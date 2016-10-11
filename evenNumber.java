import java.util.*;
import java.io.*;
import java.lang.*;

public class oddNumber
{

		public static void isOddNumber(int a,int b)
		{
			
				ArrayList <Integer> al = new ArrayList<Integer>();

			
				
				for(int i=a;i<b;i++)
				{
					
					boolean isEven = false;
					if(i%2==0)
					{
						isEven = true;
					}

					if(isEven)
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
			isOddNumber(a,b);
			



	}
} 
