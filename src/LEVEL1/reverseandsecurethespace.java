package LEVEL1;

public class reverseandsecurethespace {

	public static void main(String[] args) {
		
		String s1 = "I LOVE INDIA";
		String s2="";
		
		for(int i=s1.length()-1,j=0;i>=0 && j<s1.length()  ;i--,j++)
		{
			//when u get normal space add space to result string and increase i by 1 bcoz itll skip  1 letter
			if( s1.charAt(j)==' ')
			{
				s2=s2+' ';
				i++;
			}
			
			//when u get reverse String space decrease j by 1 or else itll reach leanght limit b4 i
			else if(s1.charAt(i)==' ')
			{
				j--;
			}
			else
			{
				s2=s2+s1.charAt(i);
			}
		}
		
		System.out.println(s2);
	}
}
