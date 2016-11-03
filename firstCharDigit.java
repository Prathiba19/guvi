import java.util.*;

public class firstCharDigit
{

	public static void main(String[] args)
	{
		String str="java";
		int[] int1= {'1','2','3','4','5','6','7','8','9','0'};
		int count = 0;
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<int1.length;j++)
			{
				if(str.charAt(i)==int1[j])
				{
					count++;
				}
			}
		}

		if(count>0)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
}