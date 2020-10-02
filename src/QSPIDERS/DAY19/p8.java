package QSPIDERS.DAY19;

import java.util.Scanner;

					/* WAP to print non repeated Elements in the String */
public class p8 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Enter Word : ");
		String word = s.nextLine().trim();
		char[] ch = word.toCharArray();
		printNonRepeatedElement(ch);
	}
	
	public static void printNonRepeatedElement(char[] ch) {
		System.out.print("Non Repeated Elements : ");
		int n=ch.length;
		for(int i=0 ; i<n ; i++)
		{
			int count = 0;
			for(int j=i+1 ; j<n ; j++)
			{
				if(ch[i]==ch[j])
				{
					for(int k=j ; k<n-1 ; k++)
					{
						ch[k]=ch[k+1];
					}
					count++;
					j--;
					n--;
				}
			}
			if(count==0)
				System.out.print(ch[i]+" ");
		}
	}
}
