package Placement_Questions;

import java.util.Scanner;

public class ReverseStringButNotReverseTheSpecialSymbols {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		int x=s.length()-1;
		String a="";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))==false&&Character.isDigit(s.charAt(i))==false) {
				a+=s.charAt(i);
			}
			else if (Character.isAlphabetic(s.charAt(x))||Character.isDigit(s.charAt(x))) {
			
				a+=s.charAt(x);
				x--;
			}
			else {
				x--;
				i--;
			}
			
		}
		System.out.println(a);
	}

}
