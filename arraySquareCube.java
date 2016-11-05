import java.util.*;


public class arraySquareCube
{


	public static void main(String[] args)
	{
		int[] int1 ={1,2,3,4,5};
		int squareSum = 0;
		int cubeSum = 0;
		int temp;
		for(int i=0;i<int1.length;i++)
		{	
			temp=int1[i];
			if(i%2==0)
			{
				squareSum=(temp*temp)+squareSum;
			}
			else
			{
				cubeSum+=(temp*temp*temp);
			}
		}

		
		System.out.println(squareSum+" "+cubeSum);
	}
}