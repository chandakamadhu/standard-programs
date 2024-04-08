package day_10;

public class RemoveSpecialSymbolsInStringArray {
	public static void main(String[] args) {
		String[] str= {"pavan@","1kalyan","ra&m"};
		for(int i=0;i<=str.length-1;i++)
		{
			String s1=str[i];
			for(int j=0;j<=s1.length()-1;j++)
			{
				if(s1.charAt(j)>='a'&&s1.charAt(j)<='z')
				{
					System.out.print(s1.charAt(j));
				}
			}
			System.out.print(" ");
		}
	}

}
