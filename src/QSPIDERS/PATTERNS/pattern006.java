package QSPIDERS.PATTERNS;

/*             1   2  3  4  5
		       11 12 13 14 15
		       21 22 23 24 25
		       16 17 18 19 20
			   6  7  8  9  10
*/
public class pattern006 {
	public static void main(String[] args) {
		
		int n=5;
		int count=1;
		int temp = 2;      //---> increment key
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<n ;j++)
			{
				System.out.print(count++ +"  ");
			}
			if(i<n/2)
				count+=n;             //---> count -= 5
			else 
				count -= n*temp++;   //---> count -= 10 | count -=15 |  count -=20
			System.out.println();
		}
	}
}
