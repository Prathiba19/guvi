/*import java.util.*;
public class juspayc7 {
	public static void main(String[] args)
	{
		int n=2;
		String str="helloworld";
		
		//System.out.println(str.charAt(7));
		//System.out.println(str.length());
		StringBuffer sb=new StringBuffer(str);		
		
		for(int i=2;i<sb.length();)
		{
			sb.deleteCharAt(i);
			n=n+1;
			i=n;
		}
		System.out.println(sb.toString());
		}
}*/

import java.util.*;

public class juspayc7 {

	public static void main(String[] args) {

		char a;
		String str1="Helloworld";
		int num=2;
		String str2=str1.substring(0, 2);
		String str3=new String();
		System.out.println(str2);
		
		for(int i=3;i<str1.length();i=i+2)
		{
			a=str1.charAt(i);
			str3+=a;
		}
		System.out.println(str2+str3);
	}
}