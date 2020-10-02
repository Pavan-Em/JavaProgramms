package QSPIDERS.DAY23;
			/* WAP to Reverse Sentence Words */
			/* WAP to Reverse Each word in the Sentence */
			/* WAP to Reverse Each word then Reverse Sentence */
public class p1 {
	public static void main(String[] args) {
		String s = "This is JAVA";
		String rs = reverseSentence(s);
		String rw = reverseEachWord(s);
		String rws = reverseEachWordAndSentence(s);
		System.out.println("Original Sentence              : "+s);
		System.out.println("Reverse-Sentence Sentence      : "+rs);
		System.out.println("Reverse-Word Sentence          : "+rw);
		System.out.println("Reverse-Word-Sentence Sentence : "+rws);
	}
	
	public static String reverseSentence(String s)
	{
		char[] ch = s.toCharArray();
		String out = "";
		for(int i=0 ; i<ch.length ; i++)
		{
			String temp="";
			while(i<ch.length && ch[i]!=' ')
			{
				temp=temp+ch[i];
				i++;
			}
			out =temp+" "+out;
		}
		return out.strip();
	}
	
	public static String reverseEachWord(String s)
	{
		char[] ch = s.toCharArray();
		String out = "";
		for(int i=0 ; i<ch.length ; i++)
		{
			String temp="";
			while(i<ch.length && ch[i]!=' ')
			{
				temp=ch[i]+temp;
				i++;
			}
			out = out+temp+" ";
		}
		return out.strip();
	}
	
	public static String reverseEachWordAndSentence(String s)
	{
		char[] ch = s.toCharArray();
		String out = "";
		for(int i=0 ; i<ch.length ; i++)
		{
			String temp="";
			while(i<ch.length && ch[i]!=' ')
			{
				temp=ch[i]+temp;
				i++;
			}
			out =temp+" "+out;
		}
		return out.strip();
	}
}
