package QSPIDERS.PATTERNS;
							/*              1 
									      1 * 3 
									    1 * 3 * 5 
									  1 * 3 * 5 * 7 
									1 * 3 * 5 * 7 * 9 
									  1 * 3 * 5 * 7 
									    1 * 3 * 5 
									      1 * 3 
									        1
					*/				         
public class pattern027 {
public static void main(String[] args) {
		
		int n=5;
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
				if(star%2==1)                         //--->or (star+row is odd)
				{
					System.out.print("* ");
					count++;
				}
				else
					System.out.print(count++ + " ");
			}
			System.out.println();
		}
		for(int row=n-2 ; row>=0 ; row--)
		{
			int count=1;
			for(int space=0 ; space<n-1-row ; space++)  //--->this is to print space
			{
				System.out.print("  ");
			}
			for(int star=0 ; (2*row)>=star ; star++)    //---->this is to print stars
			{
				if(star%2==1)                            //--->or (star+row is odd)
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
