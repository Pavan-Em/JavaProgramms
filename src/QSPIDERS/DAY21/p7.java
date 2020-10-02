package QSPIDERS.DAY21;

import java.util.Arrays;

public class p7 {
	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 },{7,8,9}};
		System.out.println("Original Matrix : ");
		printMatrix(mat);
		
		System.out.println("Transpose Matrix : ");
		int[][] transpose = transpose(mat);
		printMatrix(transpose);
		
		System.out.println("Row-Swap Matrix : ");
		int[][] row = { { 1, 2, 3 }, { 4, 5, 6 },{7,8,9}};		
		int[][] swaprow = swapRow(row);
		printMatrix(swaprow);
		
		System.out.println("Column-Swap Matrix : ");
		int[][] col = { { 1, 2, 3 }, { 4, 5, 6 },{7,8,9}};
		int[][] swapcol = swapCol(col);
		printMatrix(swapcol);
		
		System.out.println("Rotate 90 degree Right : ");
		int[][] right = { { 1, 2, 3 }, { 4, 5, 6 },{7,8,9}};
		int[][] right90 = transpose(swapRow(right));
		printMatrix(right90);
		
		System.out.println("Rotate 90 degree Left : ");
		int[][] left = { { 1, 2, 3 }, { 4, 5, 6 },{7,8,9}};
		int[][] left90 = swapRow(transpose(left));
		printMatrix(left90);
		
		System.out.println("Rotate 180 degree Left or Right : ");
		int[][] rotate = { { 1, 2, 3 }, { 4, 5, 6 },{7,8,9}};
		int[][] rotate180 = swapRow(swapCol(rotate));
		printMatrix(rotate180);

	}

	public static void printMatrix(int[][] mat) {
		for (int[] row : mat) {
			System.out.println(Arrays.toString(row));
		}
	}

	public static int[][] transpose(int[][] mat) {
		int[][] tMat = new int[mat[0].length][mat.length];
		for (int row = 0; row < tMat.length; row++) {
			for (int col = 0; col < tMat[row].length; col++) {
				tMat[row][col] = mat[col][row];
			}
		}
		return tMat;
	}
	
	public static int[][] swapRow(int[][] mat)
	{
		for(int row=0 ; row<mat.length ; row++)
		{
			for(int col=0,k=mat[row].length-1 ; col<mat[row].length/2 ; col++,k--)
			{
				int temp = mat[row][col];
				mat[row][col]=mat[row][k];
				mat[row][k]=temp;
			}
		}
		return mat;
	}
	
	public static int[][] swapCol(int[][] mat)
	{
		for (int row = 0,k=mat.length-1; row < mat.length/2; row++,k--) {
			for (int col = 0; col < mat.length; col++) {
				int temp = mat[row][col];
				mat[row][col]=mat[k][col];
				mat[k][col]=temp;
			}
		}
		return mat;
	}
}















