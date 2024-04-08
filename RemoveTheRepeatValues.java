package day_6;

import java.util.Scanner;

public class RemoveTheRepeatValues {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size number");
		int size=sc.nextInt();
		int[] ch=new int[size];
		System.out.println("enter the int values");
		for(int i=0;i<=ch.length-1;i++)
		{
			ch[i]=sc.nextInt();
		}
		int count=0;
		int large=0;
		int e=0;
		for(int i=0;i<=ch.length-1;i++)
		{
			
			int elementIsPresent=0;
			for(int j=i;j>=0;j--)
			{
				if(ch[i]==ch[j])
				{
					elementIsPresent++;
				}
			}
			if(large<elementIsPresent)
			{
				large=elementIsPresent;
				e=ch[i];
			}
			if(elementIsPresent==1)
			{
				count++;
			}
		}
			System.out.println(e+" is Present :"+large);
			
			int[] b=new int[count];  
			int index=0;
			for(int i=0;i<=ch.length-1;i++)
			{
				int elementPresent=0;
				for(int j=i;j>=0;j--)
				{
					if(ch[j]==ch[i])
					{
						elementPresent++;
					}
				}
				if(elementPresent==1)
				{
					b[index]=ch[i];
					index++;
				}
			}
			//print the second array
			for(int i=0;i<=b.length-1;i++)
			{
				System.out.print(b[i]+" ");
			}
			
		}
	}


