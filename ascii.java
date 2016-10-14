/*import java.util.*;

public class ascii
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number:");
		int n = sc.nextInt();
		int i=0;
		

		while(i<n)
		{	
			System.out.println((char)i);
			i++;
		}
	}
}*/


import java.util.*;

public class ascii
{


	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range:");
		int n = sc.nextInt();
		String str = new String();
		
		int i;
		for(i=1;i<n;i++)
		{	

			str = Character.toString((char)i);
			System.out.println("the value"+" "+i+" "+"is for charcater"+" "+str);
		}
	}
}