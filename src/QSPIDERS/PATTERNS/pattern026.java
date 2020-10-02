package QSPIDERS.PATTERNS;
							/*        1 
								    1 * 3 
								  1 * 3 * 5 
								1 * 3 * 5 * 7 
						*/		
public class pattern026 {
	public static void main(String[] args) {
		int n = 4;
		
		for(int row=0 ; row<n ; row++)
		{
			int count=1;
			//col = spaces +stars
			for(int space=0 ; space<n-1-row ; space++)  //--->this is to print space here row decides how many spaces should be printed
			{
				System.out.print("  ");
			}
			for(int star=0 ; (2*row)>=star ; star++)   //---->this is to print stars
			{
				if(star%2==1)  //--->or (star+row is odd)
				{
					System.out.print("* ");
					count++;
				}
				else
					System.out.print(count++ + " ");

			}
			System.out.println();
		}
	}
}
