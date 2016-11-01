/*import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class fileIn
{

public static void main(String[] args)
    {   
        FileReader fr;
        BufferedReader br;
            try {
            br = new BufferedReader(new FileReader("/home/gooner-hari/Documents/guvi/input1.txt"));
            try {
                String x;
                while ( (x = br.readLine()) != null ) {
                    // printing out each line in the file
                    System.out.println(x);
                } 
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}*/

import java.util.*;
import java.io.*;

public class fileIn
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


        public static int countNumber(String str)
        {

            int numCount=0;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)>='0'&&str.charAt(i)<='9')
                    numCount++;
            }

            return numCount;
        }


    public static void main(String[] args)
    {
        //FileReader fr = new FileReader("/home/gooner-hari/Documents/guvi/input1.txt");
            try
        {   
            FileReader fr = new FileReader("/home/gooner-hari/Documents/guvi/input1.txt");
            BufferedReader br = new BufferedReader(fr);
            try
            {
            String str= new String();
            str=br.readLine();
            int lineCount=0;
            int charAdd=0;
            int wordAdd=0;
            int numberAdd=0;
            while(str!=null)
             {
                    charAdd+=countChar(str);
                    wordAdd+=countWord(str);
                    numberAdd+=countNumber(str);
                    lineCount++;
                    str=br.readLine();
             }
             charAdd=charAdd-numberAdd;
             System.out.println(charAdd+"characters");
             System.out.println(wordAdd+"words");
             System.out.println(numberAdd+"numbers");
             System.out.println(lineCount+"lines");

        } catch(IOException e)
            {
                e.printStackTrace();
            }   
        } catch(FileNotFoundException e)
            {
                e.printStackTrace();
            }
    }
}