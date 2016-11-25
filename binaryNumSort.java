import java.util.*;

public class binaryNumSort
{	
	public static void sortBinary(int[] int1,int n)
	{
		int i = 0;
		int j=n-1;

		while(i<j)
		{
			while(int1[i]==0)
				i++;

			while(int1[j]==1)
				j--;

			if(i<j)
			{
				int1[i]=0;
				int1[j]=1;
				i++;
				j--;
			}
		}

		for(int k=0;k<n;k++)
		{
			System.out.println(int1[k]);
		}

	}

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		System.out.println("enter the numbers:");
		int[] int1 = new int[n];
		for(int i=0;i<n;i++)
		{
			int1[i]=sc.nextInt();
		}	

		sortBinary(int1,n);
	}
}






/*import java.util.*;

public class binaryNumSort
{

	public static void main(String[] args) {
		
Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		System.out.println("enter the numbers:");
		int[] int1 = new int[n];
		for(int i=0;i<n;i++)
		{
			int1[i]=sc.nextInt();
		}	
		int temp = 0;

		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(int1[i]>int1[j])
				{
					temp = int1[i];
					int1[i]=int1[j];
					int1[j]=temp;
				}
			}
		}


		for(int i=0;i<n;i++)
		{
			System.out.print(int1[i]);
		}


	}
}*/