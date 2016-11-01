import java.util.*;


public class greatNumbers
{	
	public static void sort(int[] int1)
	{	int temp=0;
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(int1[j]>int1[i])
				{
					temp=int1[i];
					int1[i]=int1[j];
					int1[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numberArray=new int[10];
		System.out.println("enter the 10 numbers:\n");
		for(int i=0;i<10;i++)
		{
			numberArray[i]=sc.nextInt();
		}

		sort(numberArray);
		System.out.println(numberArray[0]);

	}
}