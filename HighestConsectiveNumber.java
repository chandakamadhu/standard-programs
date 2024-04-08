package day_8;

import java.util.Scanner;

public class HighestConsectiveNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		System.out.println("enter the String values");
		int[] a=new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the number");
		int nSum=sc.nextInt();
		boolean status=false;
		for(int i=0;i<=a.length-1;i++)
		{
			
			int sum=0;
			if(a[i]==a[i+1]-1)
			{
				sum=a[i];
				while(i<a.length-1 && a[i]==a[i+1]-1)
				{
					sum=sum+a[i+1];
					
					i++;
				}
			}
			
				if(sum==nSum)
				{
					status=true;
				}
		}
		if(status)
		{
			System.out.println("sum of consective elements is equal to given number");
		}
		else {
			System.out.println("sum of consective elements is not equal to given number");
		}
	}

}
