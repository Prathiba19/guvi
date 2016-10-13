import java.util.*;


public class fibonacci
{
	public static void main(String[] args) 
	{
				

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:\n");
		int x = sc.nextInt();
		int first=0;
		int next = 0;
		int last=1;
		for(int i=0;i<x;i++)
		{
			if(i<=1)
			{
				next=i;
			}
			else
			{
			next = first+last;
			first = last;
			last=next;
			}
		
		System.out.println(next);
	}
	}
}







	
