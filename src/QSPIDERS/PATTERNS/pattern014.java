package QSPIDERS.PATTERNS;
								/* 
								    1
								    2 6 
								    3 7 10
								    4 8 11 13
								    5 9 12 14 15
								    
								 */
public class pattern014 {
	public static void main(String[] args) {
		
		int n = 7;
		
		for(int i = 0 ; i<n ; i++)
		{
			int count = i+1;
			int temp = n-1;
			for(int j = 0 ; i>=j ; j++)
			{
				System.out.print(count+" ");
				count=count+temp--;
			}
			System.out.println();
		}
	}
}
