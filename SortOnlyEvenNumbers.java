package day_6;

import java.util.Scanner;

public class SortOnlyEvenNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[j]<a[i] && a[i]%2==0 && a[j]%2==0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
