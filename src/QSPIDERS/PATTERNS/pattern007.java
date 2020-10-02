package QSPIDERS.PATTERNS;
								/*  
								      *
								      * *
								      * * *
								      * * * *
								      * * * * *
								      
								 */
public class pattern007 {
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=0 ;i<n ; i++)
		{
			for(int j=0 ; i>=j ; j++)   //-----> Written logic inside for loop and it reduces the iteration
			{
					System.out.print("* ");  //---> print space is not neccessary for this pattern
			}
			System.out.println();
		}
	}
}
