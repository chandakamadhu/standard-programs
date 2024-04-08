package day_10;

public class RemoveTheElementsGivenString {
	public static void main(String[] args) {
		String[] str= {"tiger","lion","fox","elephant","leopord"};
		char c='T';
		char c1=Character.toUpperCase(c);
		int count=0;
		for(int i=0;i<=str.length-1;i++)
		{
			char ch=str[i].charAt(0);
			char ch1=Character.toUpperCase(ch);
			if(ch!=c&&ch1!=c1)
			{
				count++;
			}
		}
		String[] b=new String[count];
		int index=0;
		for(int i=0;i<=str.length-1;i++)
		{
			char ch=str[i].charAt(0);
			char ch1=Character.toUpperCase(ch);
			if(ch!=c&&ch1!=c1)
			{
				b[index]=str[i];
				index++;
			}
		}
		for(int i=0;i<=b.length-1;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
