package QSPIDERS.DAY21;

import java.util.Arrays;

/* WAP to Reverse the Element in each Column 
 
  1 2 3       7 8 9 
  4 5 6  ===> 4 5 6
  7 8 9       1 2 3       */
public class p3 {
	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 },{7,8,9} };
		reverseElementInColumn(mat);
		reverseElementInColumn1(mat);
	}
	
	public static void reverseElementInColumn(int[][] mat)
	{
				//Printing original Matrix using forEach loop
				System.out.println("Original Matric : ");
				for (int[] row : mat) {
					System.out.println(Arrays.toString(row));
				}
				
				//reversing the elements in row
				int[][] rMat = new int[mat.length][mat[0].length];
				for(int row=0 ; row<rMat.length ; row++)
				{
					for(int col=0 ; col<rMat[row].length ; col++)
					{
						rMat[row][col]=mat[mat.length-(row+1)][col];   // Game Changer [With out Swaping By Me but need extra 2D matrix] Haha
					}
				}
				
				//printing Transpose Matrix using forEach loop
				System.out.println("Transpose Matric : ");
				for (int[] row : rMat) {
					System.out.println(Arrays.toString(row));
				}
	}
	
	public static void reverseElementInColumn1(int[][] mat)
	{
		System.out.println("=============CASE 2=============");
		//Printing original Matrix using forEach loop
		System.out.println("Original Matric : ");
		for (int[] row : mat) {
			System.out.println(Arrays.toString(row));
		}
		
		//reversing the elements in row(BEST WAY)
		for(int row=0,k=mat.length-1  ; row<mat.length/2 ; row++,k--)   // k is a Game Changer and use length/2
		{
			for(int col=0; col<mat[row].length ; col++) 
			{
				System.out.println(row+","+col+" is Swap with "+row+","+k);
				int temp = mat[row][col];
				mat[row][col]=mat[k][col];   // Game Changer
				mat[k][col]=temp;
			}
		}
		
		//printing Transpose Matrix using forEach loop
		System.out.println("\nTranspose Matric : ");
		for (int[] row : mat) {
			System.out.println(Arrays.toString(row));
		}
		
	}
}
