import java.util.*;
import java.lang.*;

public class decimalNumber
{
		

		public static void main(String[] args)
	

{
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the number:");
			String str = sc.nextLine();
			int[] int1 = new int[str.length()];
			for(int i=0;i<int1.length;i++)
			{
				int1[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
			}
			int temp=0;
			int k=int1.length-1;
			for(int j=0;j<int1.length;j++)
			{
				while(k>=0)
				{
				temp=int1[k]*(int)(Math.pow(2,j))+temp;
				k--;
				break;
				}
			}

			System.out.println(temp);
}
}