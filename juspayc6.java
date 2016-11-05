import java.util.*;


public class juspayc6
{

	public static void main(String[] args)
	{	int count=0;
		Scanner sc = new Scanner(System.in);
		String[] str = new String[5];
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.nextLine();
		}
		System.out.println("enter the value of n:\n");
		int n=sc.nextInt();
		for(int i=0;i<str.length;i++)
		{
		if(n==str[i].length())
		{
			count++;
		}
		}


		
		System.out.print(count);
	}
}



/*import java.util.Scanner;
class juspayc6
{
	public static void main(String[] arg)
	{
		String[] str;
		Integer n,i,len=0,cnt=0,s;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of an array:");
		n=in.nextInt();
		str=new String[n];
		System.out.println("Enter"+" "+n+" "+"String:");
		for(i=0;i<n;i++)
			str[i]=in.next();
		System.out.print("Enter a length of a string to find:");
		len=in.nextInt();

		for(i=0;i<n;i++)
		{
			s=str[i].length();
			if(s==len) cnt++;
		}
		System.out.print("No.of words are of given Length is:"+cnt);
	}
}*/