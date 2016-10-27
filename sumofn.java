import java.util.*;

public class sumofn
{
	public static int Sum(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			sum=sum+i;
		}

		return sum;
	}
	public static void main(String[] args) 
	{	

		System.out.println("enter the value of n:\n");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int s = Sum(n);
		System.out.println(s+" ");
	}
}