import java.util.*;
import java.io.*;
class char1
{
	public static void main(String []args)
	{
		//Reader s= new InputStreamReader(System.in);
		Scanner s= new Scanner(System.in);

		char ch= s.next().charAt(0);
		if(ch!=-1)
		{
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				System.out.println("it is a vowel\n");
			}
			else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				System.out.println("it is a vowel\n");
			else 
				System.out.println("it is a consonant\n");
		}
	}
}






