package day_6;

public class CommonPrefix {
	public static void main(String[] args) {
		String[] s={ "robery","rose", "robert"}; 
		String str=commonPrefix(s);
		System.out.println("Common Prefix :"+str);
		
	}
	public static String commonPrefix(String[] s)
	{
		if(s==null || s.length==0)
		{
			return " ";
		}
		String str=s[0];
		for(int i=0;i<=s.length-1;i++)
		{
			while(!s[i].startsWith(str))
			{
				str=str.substring(0,str.length()-1);
				if(str.isEmpty())
				{
					return "";
				}
			}
		}
		return str;
	}

}
