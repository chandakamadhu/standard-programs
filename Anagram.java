package day_7;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String s1=sc.next();
		System.out.println("enter the second string");
		String s2=sc.next();
		if(s1.length()!=s2.length())
		{
			System.out.println("Not a anagram number");
		}
		else {
			String str1=s1.toLowerCase();
			String str2=s2.toLowerCase();
			char[] c1=str1.toCharArray();
			char[] c2=str2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1,c2))
			{
				System.out.println("Anagram");
			}
			else {
				System.out.println("not");
			}
			/*String a="";
			String b="";
			for(int i=0;i<=c1.length-1;i++)
			{
				a=a+c1[i];
			}
			for(int i=0;i<=c2.length-1;i++)
			{
				b=b+c2[i];
			}
			if(a.equals(b))
			{
				System.out.println("anagram");
			}
			else {
				System.out.println("not anagram");
			}*/
		}
	}

}
