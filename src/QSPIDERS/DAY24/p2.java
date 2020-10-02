package QSPIDERS.DAY24;
				/* WAP to convert the given String to Lower case */
public class p2 {
	public static void main(String[] args) {
		String s = "PavAN";
		String as = convertToLowerCase(s);
		System.out.println("Original String : "+s);
		System.out.println("Alterred String : "+as);
	}
	
	public static String convertToLowerCase(String s)
	{
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
		}
		return new String(ch);
	}
}
