import java.util.*;


public class maxMinArray
{
	public static int[] arraySort(int[] int1)
	{	int temp=0;
		for(int i=0;i<int1.length;i++)
		{
			for(int j=0;j<int1.length;j++)
			{
				if(int1[i]<int1[j])
				{
				temp = int1[i];
				int1[i] = int1[j];
				int1[j] = temp;
				}
			}
		}

		return int1;
	}

	public static void main(String[] args)
	{
		int[] int1 = {22,33,54,6};
		for(int i:arraySort(int1))
		{
			System.out.println(i);
		}

		int sum=0;
		sum=int1[0]+int1[int1.length-1];
		System.out.println(sum);
	}
}