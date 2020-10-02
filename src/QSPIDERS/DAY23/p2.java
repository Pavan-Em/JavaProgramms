package QSPIDERS.DAY23;
			/* WAP to count the Charater in the word and print in the place of space */
public class p2 {
	public static void main(String[] args) {
		String s = "This is java";
		String wordcount = getWordCount(s);
		System.out.println(wordcount);
	}
	
	public static String getWordCount(String s)
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
			out = out+temp+temp.length();
		}
		return out.strip();
	}
}
