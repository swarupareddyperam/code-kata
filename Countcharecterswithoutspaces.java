/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Countcharecterswithoutspaces
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		//Scanner sc=new Scanner()
		Scanner sc = new Scanner(System.in);
		int sum=0;

                        //System.out.println("Please enter a string");

                         String ch = sc.nextLine();

                          //System.out.println(ch);

		//int letter=0;
		for(int i=0;i<ch.length();i++)
		{
			if(ch.charAt(i)==' ')
			{
			continue ;
			}
			sum++;
		}
		System.out.println(sum);

	}
}
