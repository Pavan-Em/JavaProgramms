package QSPIDERS.PATTERNS;
						/*  
						      *
						      * * *
						      * * * * *
						 */
public class pattern020 {
	public static void main(String[] args) {
		
		int n = 3;
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; (2*i)>=j ; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
