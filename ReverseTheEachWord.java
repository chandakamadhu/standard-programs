package day_6;

import java.util.Scanner;

public class ReverseTheEachWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String[] s=str.split(" ");
		for (int i = 0; i <= s.length-1; i++)   
		{                                       
			String s1=s[i];
			for(int j=s1.length()-1;j>=0;j--)
			{
				char ch=s1.charAt(j);
				System.out.print(ch);
			}
			System.out.print(" ");
		}
	}
 
}
