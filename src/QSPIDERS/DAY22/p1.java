package QSPIDERS.DAY22;

/* WAP to reverse the String */
public class p1 {
	public static void main(String[] args) {
		String st = "pavan";
		
		String s = reverseString(st);
		System.out.println(s);
		
		System.out.println("=====================================");

		String star = revrseStringUsingCharArray(st);
		System.out.println(star);
	}

	public static String reverseString(String st) {
		String s = "";
		for (int i = st.length() - 1; i >= 0; i--) {
			s = s + st.charAt(i);
		}
		return s;
	}

	public static String revrseStringUsingCharArray(String st) {
		char[] star = st.toCharArray();
		for (int i = 0, j = st.length() - 1; i < star.length / 2; i++, j--) {
			if(star[i]!=star[j])
			{
				char temp = star[i];
				star[i] = star[j];
				star[j] = temp;
			}
		}
		return new String(star);  // ---> or u can use String.valueOf(star)
	}
}
