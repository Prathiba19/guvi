import java.util.*;

public class subStringSearch
{

	public static void main(String[] args)
	{
		String str="hellomydearhello";
		String findstr = "lo";
		int matches = 0;
		int l=str.length()-findstr.length();
		for(int i=0;i<=l;i++)
		{
			for(int j=0;j<findstr.length();j++)
			{
				if(str.charAt(i+j)==findstr.charAt(j))
				{
					if(j==findstr.length()-1)
					{
						matches++;
						break;
					}		
				}
				else
				break;	
			}
		}

		System.out.println("number of occurence of substring:\n"+matches);

	}
}