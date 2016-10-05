import java.util.*;
class posorneg
{
	public static void main(String []args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number:\n");
		int n =s.nextInt();

		if(n==0)
		{
			System.out.println("number is zero\n");
		}

		else if(n>0)
		{
			System.out.println("number is positive\n");
		} 
		else
		{
			System.out.println("number is negative");
		}
	}
}
