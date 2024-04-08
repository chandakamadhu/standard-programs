package day_10;

import java.util.Arrays;
import java.util.Scanner;

public class InsertNewElementAtPosition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= {1,2,3,4};
		int len=a.length+1;
		int[] b=new int[len];
		System.out.println("enter the index position");
		int ind=sc.nextInt();
		System.out.println("enter the element");
		int ele=sc.nextInt();
			for(int j=b.length-1;j>ind;j--)
			{
					b[j]=a[j-1];
					System.out.println(b[j]);
					
			}
			for(int i=0;i<=ind;i++)
			{
				
				if(i==ind)
				{
					b[i]=ele;
				}
				else {
					b[i]=a[i];
				}
				
			}
		System.out.println(Arrays.toString(b));
	}

}
