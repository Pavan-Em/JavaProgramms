package QSPIDERS.DAY21;

import java.util.Arrays;

/* WAP to reverse the Element in the each Row  
			   
			   1 2 3       3 2 1 
			   4 5 6  ===> 6 5 4 
			   7 8 9       9 8 7    	 */
public class p2 {
	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 },{7,8,9} };
		reverseElementInRow(mat);
		reverseElementInRow1(mat);
	}
	
	public static void reverseElementInRow(int[][] mat)
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
				rMat[row][col]=mat[row][mat[row].length-(col+1)];   // Game Changer [With out Swaping By Me but need extra 2D matrix] Haha
			}
		}
		
		//printing Transpose Matrix using forEach loop
		System.out.println("Transpose Matric : ");
		for (int[] row : rMat) {
			System.out.println(Arrays.toString(row));
		}
	}
		
		public static void reverseElementInRow1(int[][] mat)
		{
			System.out.println("=============CASE 2=============");
			//Printing original Matrix using forEach loop
			System.out.println("Original Matric : ");
			for (int[] row : mat) {
				System.out.println(Arrays.toString(row));
			}
			
			//reversing the elements in row(BEST WAY)
			for(int row=0 ; row<mat.length ; row++)
			{
				for(int col=0,k=mat[0].length-1 ; col<mat[row].length/2 ; col++,k--)  // k is a Game Changer and we use length/2 to minimise Iteration
				{
					System.out.println(row+","+col+" is Swap with "+row+","+k);
					int temp = mat[row][col];
					mat[row][col]=mat[row][k];   // Game Changer
					mat[row][k]=temp;
				}
			}
			
			//printing Transpose Matrix using forEach loop
			System.out.println("Transpose Matric : ");
			for (int[] row : mat) {
				System.out.println(Arrays.toString(row));
			}
			
		}
	
}
