import java.util.*;


public class swapBits
{
		public static void swap(int a,int b)
		{

			a=a^b;
			b=a^b;
			a=a^b;
			System.out.println(a+" "+b);
		}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two numbers:\n");
		int a=sc.nextInt();
		int b=sc.nextInt();
		swap(a,b);
	}
}