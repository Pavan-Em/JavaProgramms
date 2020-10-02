package QSPIDERS.DAY19;

import java.util.Scanner;

								/* WAP to remove Duplicte string in the Sentence*/
public class p2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Sentence : ");
		String sentence = s.nextLine();
		String[] sentencear = sentence.split(" ");
		String alteredSentence = deleteDuplicate(sentencear);
		System.out.println("Altered Sentence :");
		System.out.println(alteredSentence);
	}
	
	public static String deleteDuplicate(String[] sentence)
	{
		int count=0;   //----->to know number of duplictes 
		int n=sentence.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(sentence[i].equals(sentence[j]))
				{
					for(int k=j;k<n-1;k++)
					{
						sentence[k]=sentence[k+1];
					}
					count++;
					n--; 	//------>to reduce iteration 
					j--;	//------>to compare with the modifide element present in index 1       
				}
			}
		}		
		String returnSentence = "";
		for(int i=0;i<n;i++)
		{
				returnSentence+=sentence[i]+" ";
		}
		return returnSentence;
	}
}
