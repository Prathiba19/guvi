import java.util.*;

class armStrongNumber2
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range:\n");
		int Finput=sc.nextInt();
		int Linput=sc.nextInt();
		int last,cube;

		for(int i=Finput;i<Linput;i++)
		{
			//boolean isArmStrong = false;
			int temp=i;
			int arm=0;
			while(temp!=0)
			{
				last = temp%10;
				cube = last*last*last;
				temp = temp/10;
				arm = arm+cube;
			}
			/*if(i == arm)
			{
				isArmStrong = true;
			}*/

			if(i == arm)
			{
				System.out.println(i+" ");
			}


		}

	}
}
