package QSPIDERS.PATTERNS;
						/*    Aa
						      Bb Cc
						      Dd Ee Ff
						      Gg Hh Ii Jj
						      Kk Ll Mm Nn Oo
						 */

           /*  char count = 'A';
            *  char count2 = 'a';
            *  
            *  just print and incremrnt ----> count++ +""+count2++ + " "   ----> this is enoug
            */
public class pattern016 {
	public static void main(String[] args) {
		int n=5;
		char ch = 'A';
		for(int i =0 ; i<n ; i++)
		{
			for(int j=0 ; i>=j ; j++)
			{
				System.out.print(ch+""+(char)(ch+32)+" ");
				ch =(char)(ch+1);
			}
		
			System.out.println();
		}
	}

}
