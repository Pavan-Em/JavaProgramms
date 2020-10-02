package QSPIDERS.PATTERNS;
						/*      * * * * * * * 
						        * *   *   * *
						        *   * * *   *
						        * * * * * * *
						        *   * * *   *
						        * *   *   * *
						        * * * * * * *
						 */
public class pattern004 {
	public static void main(String[] args) {
		int n = 11;
		if(n>5 && n%2==0)   // ---> n should be odd and n>5
		{
			for(int i=0 ;i<n ;i++)
			{
				for(int j=0 ; j<n ; j++)
				{
					if(i==0 || j==0 || i==n-1 || j==n-1)  //---> this is for outer frame
						System.out.print("* ");
					else if(i+j==n-1 || i==j)
						System.out.print("* ");          //---> this is for diagonal 
					else if(i == n/2 || j==n/2)
						System.out.print("* ");          //---> this is for center lines
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Give proper data");
	}
}
