import java.util.*;


public class binarySubstring

{
	public static int findsub(char[] str1)
	{
		int count = 0;
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i]=='1')
			{
					for(int j=i+1;j<str1.length;j++)
				{
					if(str1[j]=='0')
					{
						count++;
					}
				}
			}
		}

		return count;
	}

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		char[] str1 = new char[str.length()];
		str1=str.toCharArray();
		System.out.println(findsub(str1));	
	}
}