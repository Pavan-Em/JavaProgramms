package QSPIDERS.PATTERNS;
							/*
							       1
							       2 3
							       4 5 6
							       7 8 9 10
							 */
public class pattern011 {
	public static void main(String[] args) {
		int n = 4 ;
		int count=1;
		for(int i=0 ;i<n ;i++)
		{
			for(int j=0 ; i>=j ; j++)
			{
				System.out.print(count+++" ");
			}
			System.out.println();
		}
	}
}
