import java.util.*;

public class numReverse
{

		public static void isReverse(int n)
		{
			int temp = n;
			int rev = 0;
			int last;
			

			while(temp!=0)
			{
				last =temp%10;
				rev = rev*10+last;
				temp = temp/10;
			}

			System.out.println(rev);
		}




	public static void main(String[] args) 

	{
		

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to be reversed:");
		int numInput = sc.nextInt();

		isReverse(numInput);	
	}
}