package QSPIDERS.DAY26;

public class p1 {
	public static void main(String[] args) {
		// System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println("===Remove space in the given Strinn===");
		String word1 = "  pava an  ";
		String output1 = removeSpace(word1);
		System.out.println("Original String : " + word1);
		System.out.println("Altered String  : " + output1);

		System.out.println("===Converting given String to LowerCase===");
		String word2 = "PAvaN";
		String output2 = toLowercase(word2);
		System.out.println("Original String : " + word2);
		System.out.println("Altered String  : " + output2);

		System.out.println("===Sort given String in Ascending order===");
		String word3 = "java";
		String output3 = sortInAsc(word3);
		System.out.println("Original String : " + word3);
		System.out.println("Altered String  : " + output3);

		System.out.println("===Comparing two Strings===");
		String s1 = "Programm";
		String s2 = "programm";
		if (compareString(s1, s2))
			System.out.println("Strings are Equal");
		else
			System.out.println("Strings are not Equal");

		System.out.println("===Check for Anagrams===");
		String s3 = "Mother IN LAw";
		String s4 = "HITLer WomAN";
		if (isAnagrams(s3, s4))
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
		
		System.out.println("===Case2 Check for Anagrams===");
		String s5 = "Mother IN LAw";
		String s6 = "HITLer WomAN";
		System.out.println(s5);
		System.out.println(s6);
		String removeSpaces5 = removeSpace(s5);
		String removeSpaces6 = removeSpace(s6);
		System.out.println(removeSpaces5);
		System.out.println(removeSpaces6);
		String tolowers5 = toLowercase(removeSpaces5);
		String tolowers6 = toLowercase(removeSpaces6);
		System.out.println(tolowers5);
		System.out.println(tolowers6);
		String sort5 = sortInAsc(tolowers5);
		String sort6 = sortInAsc(tolowers6);
		System.out.println(sort5);
		System.out.println(sort6);
		if(compareString(sortInAsc(removeSpace(s5)), sortInAsc(removeSpace(s6))))
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
	}

	public static String removeSpace(String s) {
		char[] ch = s.toCharArray();
		String res = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				res = res + ch[i];
			}
		}
		return res;
	}

	public static String toLowercase(String s) {
		char[] ch = s.toCharArray();
		String res = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z')
				ch[i] = (char) (ch[i] + 32);			
		}
		return new String(ch);
	}

	public static String sortInAsc(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[j] < ch[i]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return new String(ch);
	}

	public static boolean compareString(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		if (ch1.length == ch2.length) {
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i])
					return false;
			}
			return true;
		} else
			return false;
	}

	public static boolean isAnagrams(String s1, String s2) {    //----->prefer this common man
		String s3 = p1.removeSpace(s1);
		String s4 = p1.removeSpace(s2);
		char[] ch1 = s3.toCharArray();
		char[] ch2 = s4.toCharArray();
		if (ch1.length == ch2.length) {
			for (int i = 0; i < ch2.length; i++) {
				for (int j = i; j < ch2.length; j++) {
					if (ch1[i] == ch2[j]  || ch1[i]==ch2[j]+32 || ch1[i]==ch2[j]-32) {
						char temp = ch2[i];
						ch2[i] = ch2[j];
						ch2[j] = temp;
						break;
					}
					if (j == ch2.length - 1)
						return false;
				}
			}
			return true;
		} else
			return false;
	}
}
