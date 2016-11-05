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



