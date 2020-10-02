package QSPIDERS.DAY20;

import java.util.Arrays;

public class p1 {
	public static void main(String[] args) {
		int[][] num2d = new int[3][];
		num2d[0]= new int[] {1,5,6,8,9};
		num2d[1]= new int[] {9,4,6};
		num2d[2]= new int[] {4,8,9,4};
		
		//for loop Iteration
		int totalSum = 0;
		for(int row=0;row<num2d.length;row++)
		{
			System.out.println("Main Array at position "+row+" : "+Arrays.toString(num2d[row]));
			int sum=0;
			for(int col=0;col<num2d[row].length;col++)
			{
				sum+=num2d[row][col];
			}
			System.out.println("Sum Array Element : "+sum);
			totalSum+=sum;
		}
		System.out.println("Sum of All Array Elements : "+totalSum);
		System.out.println("===============================================");
		//forEach loop Iteration
		for(int[] row : num2d)
		{
			System.out.println(Arrays.toString(row));
			for(int col : row)
			{
				System.out.print(col+" ");
			}	
			System.out.println();
		}
		
		/*=====================================    =============================*/
		System.out.println("==================CASE2====================");
		int[][] ar = {{1,2,4},{5,1},{4,5,7,6,1}};
		for(int row=0 ; row < ar.length ;row++)
		{
			System.out.print(row+" Position Array Elements : ");
			for(int col=0 ; col<ar[row].length;col++)
			{
				System.out.print(ar[row][col]+" ");
			}
			System.out.println();
		}
		
	}
}
