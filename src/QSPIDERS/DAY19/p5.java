package QSPIDERS.DAY19;

import java.util.Scanner;

						/* WAP to print duplicte String in the Sentence  */
public class p5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Sentence : ");
		String sentence = s.nextLine();
		String[] sentencear = sentence.split(" ");
		printDuplicate(sentencear);
		
	}
	
	public static void printDuplicate(String[] sentence)
	{
		int n=sentence.length;
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=i+1;j<n;j++)
			{
				if(sentence[i].equals(sentence[j]))
				{
					for(int k=j;k<n-1;k++)
					{
						sentence[k]=sentence[k+1];
					}
					count++;
					n--; 	
					j--;      
				}
			}
			if(count>0)
			System.out.println(sentence[i]+" is Repeating "+(count)+" Times");
		}
	}
}
