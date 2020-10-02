package QSPIDERS.PATTERNS;
						/* 
						     *
						     * *
						     * * *
						     * *
						     *
						     
						 */
public class pattern017 {
	public static void main(String[] args) {
		int n = 3;
		
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; i>=j ; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1 ; i<n ; i++)
		{
			for(int j=0 ; (i+j)<=n-1 ; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
