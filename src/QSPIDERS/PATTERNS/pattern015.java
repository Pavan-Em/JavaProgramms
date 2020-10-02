package QSPIDERS.PATTERNS;
							/*   1
							     0 1
							     0 1 0
							     1 0 1 0
							     0 1 0 1 0
							 */
public class pattern015 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 0 ;i<n ; i++)
		{
			for(int j=0 ; i>=j ; j++)
			{
				System.out.print((i+j)%2==0?1:0);    //---->Game Changer
			}
			System.out.println();
		}
	}
}
