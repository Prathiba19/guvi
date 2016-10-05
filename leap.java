import java.util.*;
import java.lang.*;
import java.io.*;

class leap
{
	 public static void leapyear(int a,int b,int s)
	 {
	 	int f=0;
	 	int count=0;
	 	int[] ly = new int[s];
	 	for(int i=a;i<=b;i++)
	 	{
	 		if(((i%4==0) && (i%100!=0))||(i%400==0))
	 		{
	 		
	 			
	 			

	 				ly[f]=i;
	 				f++;
	 				
	 		 
	 		
				count++;
			}
			
		}
	

		display(count,ly);
	}
	 

	public static void display(int count1,int[] ly)
	{
		
		for(int i=0;i<ly.length;i++)
		{
			System.out.printf(ly[i]+",");
		}

		System.out.println(count1 +"");

	}
	 
	 public static void main(String[] args) throws java.lang.Exception

	 {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter start of year range :\n");
	int a=sc.nextInt();
	System.out.println("enter end of year range :\n");
	int b=sc.nextInt();
	int s= b-a;
	leapyear(a,b,s);
	




	 }
}