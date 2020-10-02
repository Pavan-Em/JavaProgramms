package QSPIDERS.DAY25;
				/* WAP to remove Space in the given String */
public class p3 {
	public static void main(String[] args) {
		System.out.println("Remove Space from the given String");
		String s = "pav an";
		String output = removeSpace(s);
		System.out.println("Original String : "+s);
		System.out.println("Altered String  : "+output);
	}
	public static String removeSpace(String s)
	{
		char[] ch= s.toCharArray();
		String res="";
		for(int i=0 ; i<ch.length ;i++)
		{
			if(ch[i]!=' ')
					res=res+ch[i];
		}
		return res;
	}
}
