import java.util.*;


public class lcm
{	

	public static int gcd(int n1,int n2)
	{
		if(n1==n2)
		{

			return n1;
		}
		else if(n1>n2)
		{
			return gcd(n1-n2,n2);
		}
		else
		{
			return gcd(n1,n2-n1);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int prod,result=0;

		int div = gcd(n1,n2);
		
		prod=n1*n2;
		result = prod/div;
		System.out.println(result);
	}
}