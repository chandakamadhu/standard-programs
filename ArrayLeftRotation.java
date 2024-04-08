package day_6;

import java.util.Scanner;

public class ArrayLeftRotation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array size");
	int size=sc.nextInt();
	int[] a=new int[size];
	System.out.println("enter the elements");
	for(int i=0;i<=a.length-1;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("enter the number of Left rotations");
	int rot=sc.nextInt();
	for(int i=1;i<=rot;i++)
	{
		int temp=a[a.length-1];
		for(int j=a.length-2;j>=0;j--)
		{
			a[j+1]=a[j];
		}
		a[0]=temp;
	}
	System.out.println("After rotation of the given array");
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.print(a[i]+" ");
	}
}

}
