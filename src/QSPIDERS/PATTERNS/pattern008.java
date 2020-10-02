package QSPIDERS.PATTERNS;
						/* 
							     * * * * *
							     * * * *
							     * * *
							     * *
							     *    
						 */
public class pattern008 {
	public static void main(String[] args) {
		
		int n = 7;
		
		for(int i=0 ;i<n ; i++)
		{
			for(int j=0 ; j+i<n ; j++)    //-----> Written logic inside for loop and it reduces the iteration
			{
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
