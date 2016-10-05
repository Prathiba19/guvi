import java.util.*;
import java.io.*;

public class alphabet
{	
	public static final char[] ALPHABETS={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','k','q','r','s','t','u','v','w','x','y','z'};
	public static final char SPACE=' ';

	public static char[] getAlphabets()
	{
		return ALPHABETS;
	}

		public static boolean isSpace(char c)
		{
			return SPACE==c;
		}

			public static boolean isAlphabet(char c)
			{
				boolean isAlphabet=false;
				for(int i=0;i<getAlphabets().length;i++)
				{
					if(getAlphabets()[i]==c)
					{
						isAlphabet=true;
						break;
					}
				}
				return isAlphabet;
			}

	public static void main(String []args) throws Exception

	{
		int alphabetCount = 0;
		int spaceCount = 0;


		Scanner s = new Scanner(System.in);
		System.out.println("enter the bloody string:\n");
		String str = s.nextLine();

		for(int i=0;i<str.length();i++)
		{
			char letter = str.charAt(i);
			if(!isSpace(letter))
			{
				if(isAlphabet(letter))
				{	

					System.out.println(letter+" ");
					System.out.println("is an alphabet\n");
					alphabetCount++;
				}
				else
				{	

					System.out.println(letter+" ");
					System.out.println("not an alphabet\n");
				}

			}

			else 
			{
				spaceCount++;
			}
		}

		System.out.println("number of alphabets:" + alphabetCount+" "+
			"number of spaces:"+spaceCount+" ");
	}
}