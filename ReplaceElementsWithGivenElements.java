package day_10;

import java.util.Scanner;

public class ReplaceElementsWithGivenElements {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String s=sc.next();
			String s2="";
			for(int i=0;i<=s.length()-1;i++)
			{
				int count=0;
				for(int j=i;j>=0;j--)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						count++;
					}
				}
				if(count==1)
				{
					s2=s2+s.charAt(i);
					
				}
			}
			System.out.println(s2);
			System.out.println("enter the character");
			char ch1=sc.next().charAt(0);
			System.out.println("enter the replace character");
			char ch2=sc.next().charAt(0);
			for(int i=0;i<=s2.length()-1;i++)
			{
				if(ch1==s2.charAt(i))
				{
					System.out.print(ch2+" ");
				}
				else {
					System.out.print(s2.charAt(i)+" ");
				}
			}
		}

	
}
