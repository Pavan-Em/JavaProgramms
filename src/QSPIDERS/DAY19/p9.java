package QSPIDERS.DAY19;

import java.util.Scanner;

						/* WAP to print Non Repeated String in the Sentence  */
public class p9 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a Sentence : ");
		String sentence = s.nextLine().strip();
		String[] sentencear = sentence.split(" ");
		printNonRepeatedElement(sentencear);
	}
	
	public static void printNonRepeatedElement(String[] sentence)
	{
		System.out.println("Non Repeated Elements : ");
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
			if(count==0)
			System.out.println(sentence[i]);
		}
	}
}
