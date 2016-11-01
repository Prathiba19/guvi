import java.util.*;

public class charCount
{
		public static int countChar(String str)
		{
			int charCount1 = 0;
			int spaceCount = 0;

			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)==' ')
					spaceCount++;

				else 
					charCount1++;
			}
				return charCount1;
		}


		public static int countWord(String str)
		{
			int wordCount=1;
			char[] ch1 = new char[str.length()];
			ch1 = str.toCharArray();

			for(int i=0;i<str.length();i++)
			{
				if(ch1[i]==' '&&ch1[i-1]!=' ')
				{
					wordCount++;
				}

			}

			return wordCount;
		}




	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = new String();
		str =sc.nextLine();
		System.out.println(countChar(str));
		System.out.println(countWord(str));
	
	}
}