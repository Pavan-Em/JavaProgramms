package QSPIDERS.PATTERNS;
							/*    
							     1
							     3  2
							     6  5 4
							     10 9 8 7
							 */
public class pattern012 {
	public static void main(String[] args) {
		int n=6;
		int count = 1;
		for(int i=0 ; i<n ;i++)
		{
			int temp = count;
			for(int j=0 ; i>=j ; j++)
			{
				System.out.print(temp--+" ");
			}
			count +=(i + 2);     //---->Game Changer
			System.out.println();
		}
		
	}
}
