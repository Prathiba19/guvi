import java.util.*;

public class numofdigit
{
	

	public static int isCount(int n)
	{

		int count = 0; 
		while(n!=0)
		{
			n=n/10;
			count++;
		}

		return count;
	}





	public static void main(String[] args) 
	{
			Scanner s= new Scanner(System.in);
			System.out.println("enter the number:\n");
			int n = s.nextInt();
			int num = isCount(n);
			System.out.println( num+" "+"digit(s)");
	}
}