package QSPIDERS.DAY25;

                /* WAP to count the Words */
public class p4 {
	public static void main(String[] args) {
		System.out.println("Count the Words in the given Sentence");
		String s = "";
		int count = countWords(s);
		System.out.println(s);
		System.out.println("Word Count : " + count);
	}

	public static int countWords(String s) {
		char[] ch = s.toCharArray();
		int count = 1;
		if (ch.length > 0) {  //----> Logic for Empty String
			
			if (ch[0] == ' ')  //---> Logic for front space
				count = 0;
			
			for (int i = 0; i < ch.length - 1; i++) { // --->Inportant
				if (ch[i] != ch[i + 1] && ch[i] == ' ') { // ---> Logic for last space
					count++;
				}
			}
			return count;
		} else
			return 0;
	}
}
