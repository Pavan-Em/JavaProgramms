package QSPIDERS.DAY23;
						/* WAp to to replace words in Sentence */
public class p4 {
	public static void main(String[] args) {
		String s = "amit works in accolite and accolite is good";
		String sw = replaceWords(s);
		System.out.println("Original Sentence : "+s);
		System.out.println("Alterred Sentence : "+sw);
	}
	
	public static String replaceWords(String s)
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
			if(temp.equals("works"))
				temp="accolite";
			else if(temp.equals("accolite"))
				temp="works";
			out = out+temp+" ";
		}
		return out.strip();
	}
}
