import java.util.*;


public class words2
{


	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the string:");

		String str = new String();
		str = sc.nextLine();
		char[] ch1 = new char[str.length()];
		ch1=str.toCharArray();
		int words=1;

		for(int i=0;i<str.length();i++)
		{
			if(ch1[i]==' '&&ch1[i-1]!=' ')
				words++;
		}

		System.out.println(words);
	}
}