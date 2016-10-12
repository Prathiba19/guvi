/*import java.util.*;

class factorialNumber
{
	
	public static int isFactorial(int n)
	{

			int a = n;
			int f=1;
			
			if(a>0)
			{
				f=a*isFactorial(a-1);
			}

			return f;

			

	}

	public static void main(String[] args) 

	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:\n");
		int input = sc.nextInt();
		int factorial = isFactorial(input);
		System.out.println(factorial);



	}	
}*/


import java.util.*;

class factorialNumber
{

	public static void isFactorial(int n)
	{
		int f=1;
		for(int i=n;i>0;i--)
		{
			f=f*i;
		}

		System.out.println(f);

	}


	public static void main(String[] args) 

	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:\n");
		int input = sc.nextInt();
		isFactorial(input);




	}	
}