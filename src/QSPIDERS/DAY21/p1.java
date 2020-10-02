package QSPIDERS.DAY21;

/*WAP to transpose a given matrix 
  
   1 2 3     1 4 7
   4 5 6 ==> 2 5 8
   7 8 9     3 6 9                */
import java.util.Arrays;

public class p1 {
	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 } };
		transposematrix(mat);
	}

	public static void transposematrix(int[][] mat) {
		
		//Printing original Matrix using forEach loop
		System.out.println("Original Matric : ");
		for (int[] row : mat) {
			System.out.println(Arrays.toString(row));
		}
		
		//Transposing Matrix
		int[][] tMat = new int[mat[0].length][mat.length];
		for (int row = 0; row < tMat.length; row++) {
			for (int col = 0; col < tMat[row].length; col++) {
				tMat[row][col] = mat[col][row];
			}
		}
		
		//printing Transpose Matrix using forEach loop
		System.out.println("Transpose Matric : ");
		for (int[] row : tMat) {
			System.out.println(Arrays.toString(row));
		}
	}
}
