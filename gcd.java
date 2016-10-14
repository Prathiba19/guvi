import java.util.*;

public class gcd
{

		public static int isgcd(int n1,int n2)
		{

			if(n1==n2)
			{
				return n1;
			}
			else if(n1>n2)
			{
				return isgcd(n1-n2,n2);
			}
			else
			{
				return isgcd(n1,n2-n1);
			}
		}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers :\n");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println(isgcd(n1,n2));
	}
}