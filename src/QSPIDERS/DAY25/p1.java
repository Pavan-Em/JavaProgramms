package QSPIDERS.DAY25;

/* String1 - computer
 * String2 - program2
 * output  - cute
 */
public class p1 {
	public static void main(String[] args) {
		String s1 = "computer";
		String s2 = "computer";

		String output = removeDuplicteFromString1(s1, s2);
		System.out.println(output);

	}

	public static String removeDuplicteFromString1(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		String res = "";
		if (!s1.equals(s2)) {
			for (int i = 0; i < s1.length(); i++) {
				for (int j = 0; j < s2.length(); j++) {
					if (ch1[i] == ch2[j])
						break;
					if (j == s2.length() - 1)
						res = res + ch1[i];
				}
			}
			return res;
		} else
			return "";
	}
}
