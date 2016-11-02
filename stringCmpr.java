import java.util.*;


public class stringCmpr
{

	public static void compare(char[] ch1,char[] ch2)
	{	
			int count=0;
			if(ch1.length==ch2.length)
			{
				for(int i=0;i<ch1.length;i++)
				{
					if(ch1[i]==ch2[i])
					{
						++count;
					}
				}
			}


	
			if(count>=ch1.length)
			{
				System.out.println("equal");
			}
			else
			{
				System.out.println("not equal");
			}
		

	}


	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		String str1 = new String();
		String str2 = new String();

		System.out.println("enter the two strings:\n");

		str1=sc.nextLine();
		str2=sc1.nextLine();

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();


		compare(ch1,ch2);

		long starttime=System.currentTimeMillis();
		long totaltime=System.currentTimeMillis()-starttime;
		System.out.println(totaltime+"ms");

		
	}
}