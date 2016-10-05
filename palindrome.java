import java.util.*;
import java.io.*;
import java.lang.*;



public class palindrome
{	
		public static boolean palindromeMethod(int n)
		{
			boolean ispalindrome = false;

			int temp = n;
			int last,rev=0;
			while(temp!=0)
			{
				last=temp%10;
				rev = rev*10+last;
				temp=temp/10;
			}

			if(rev==n)
			{
			 ispalindrome = true;
			}


			return ispalindrome;
		}


		public static void isPalindrome(boolean b)
		{
		if(b)
			System.out.println("is a palindrome\n");
		else
			System.out.println("is not a palindrome\n");
		}

	public static void main(String[] args) 
	

	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number:" );
		int n=scanner.nextInt();
		boolean b =palindromeMethod(n);
		isPalindrome(b);

	}	
		
}