package Placement_Questions;

import java.util.Scanner;

public class MegaNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		check(number);
		
	}
	public static void check(int number)
	{
		int temp=number;
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		
		
		if(count==2)
		{
			int c1=0;
			int dCount=0;
			int c=0;
			while(temp!=0)
			{
				int ld=temp%10;
				dCount++;
				for(int i=1;i<=ld;i++)
				{
					if(ld%i==0)
					{
						c++;
					}
				}
				
			}
			if(c==2)
			{
				c1++;
			}
			temp/=10;
			
		}
		else {
			System.out.println("not prime");
		}
		
	}
	
	
}
