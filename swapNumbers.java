import java.util.*;


public class swapNumbers
{
		public static void swap(int a,int b,int c)
		{
			int temp=0;
			temp=a;
			a=b;
			b=c;
			c=temp;

			System.out.println(a+" "+b+" "+c);
		}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the three numbers:\n");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		swap(a,b,c);
	}
}