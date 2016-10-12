import java.util.*;

class armStrongNumber
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:\n");
		int n=sc.nextInt();
		int last,cube,arm=0;


		int temp=n;
		while(temp!=0)
		{
			last = temp%10;
			cube = last*last*last;
			temp = temp/10;
			arm = arm+cube;
		}
		if(arm ==n)
		{
			System.out.println("armstrong number\n");
		}
		else
		{
			System.out.println("get out");
		}

	}
}