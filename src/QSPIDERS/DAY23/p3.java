package QSPIDERS.DAY23;
		/* WAP to reverse every alternatne Word in the Sentence */
public class p3 {
	public static void main(String[] args) {
		String s = "Programm to Reverse Alternate Word";
		String rw = reverseAlternateWord(s);
		System.out.println("Original Sentence : "+s);
		System.out.println("Alterred Sentence : "+rw);
	}
	
	public static String reverseAlternateWord(String s)
	{
		char[] ch = s.toCharArray();
		String out = "";
		int flag = 1;
		for(int i=0 ; i<ch.length ; i++)
		{
			String temp="";
			while(i<ch.length && ch[i]!=' ')
			{
				if(flag%2!= 0)
				{
					temp=temp+ch[i];
					i++;
				}
				else if(flag%2==0)
				{
					temp=ch[i]+temp;
					i++;
				}
			}
			out = out+temp+" ";
			flag++;
			
		}
		return out.strip();
	}
}
