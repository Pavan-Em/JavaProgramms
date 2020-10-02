package QSPIDERS.PATTERNS;
						/*      1
						        3  2
						        4  5  6
						        10 8  7  6
						        11 12 13 14 15
						 */
public class pattern013 {
	public static void main(String[] args) {
		int n=5;
		int count = 1;
		for(int i=0 ; i<n ;i++)
		{
			int temp = count;
			for(int j=0 ; i>=j ; j++)
			{ 
				if(i%2!=0)
				    System.out.print(temp--+" ");
				else
				{
					System.out.print(temp+" ");
					count=temp++;     //---->Game Changer
				}
			}
			if(i%2==0)
				count +=(i + 2);     //---->Game Changer
			else
				count+=1;            //---->Game Changer
			System.out.println();
		}
		
	}
}
