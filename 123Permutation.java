import java.util.*;

public class 123Permutation
{


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of digits:");
		int n = sc.nextInt();
		int[] int1 = new int[n];
		System.out.println("enter the number:");
		for(int i=0;i<n;i++)
		{
			int1[i]=sc.nextInt();
		}	



		for(x=0;x<n;x++)
		{
			for(y=0;y<n;y++)
			{
				for(z=0;z<n;z++)
				{
					if(x!=y&&y!=z&&z!=x)
					{
						System.out.println(int1[x]+int1[y]+int1[z]);
					}
				}
			}
		}
	}
}