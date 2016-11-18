import java.util.*;



public class binaryNumber
{



	public static int[] convertBinary(int[] int1,int n)
	{
		for(int i=0;i<int1.length;i++)
		{
			int1[i]=n%2;
			n=n/2;
		}

		return int1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number;\n");
		int n=sc.nextInt();
		int[] int1=new int[9];
		for(int i:convertBinary(int1,n))
		{
			System.out.println(i);
		}

		System.out.println("Other method");

		System.out.println(Integer.toBinaryString(n));

	}
}