import java.util.*;

public class sumNumbers
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int sum=0;
		for(int i=1;i<16;i++)
		{
		sum+=i;
		}

		for(int i=15;i<46;i+=2)
		{
			sum+=i;
		}
		System.out.println(sum);


	}
}