package QSPIDERS.DAY25;
			/* WAP to remove vowel in the String */
public class p2 {
	public static void main(String[] args) {
		System.out.println("Remove Vowels in the given String");
		String s = "pavan";
		String output= removeVowel(s);
		System.out.println("Original String : "+s);
		System.out.println("Altered String  : "+output);
	}
	
	public static String removeVowel(String s)
	{
		char[] ch= s.toCharArray();
		String res="";
		for(int i=0 ; i<ch.length ;i++)
		{
			if(!(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U'))
					res=res+ch[i];
		}
		return res;
	}
}
