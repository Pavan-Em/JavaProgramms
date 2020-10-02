package CrazyProbs;
								/*
								 *  Pavan   ----->  PPaavvaann
								 * PPavan  ----->  PPaavvaann
								 * Ppavan  ----->  PPppaavvaann
								 * 
								 */
import java.util.Scanner;

public class Crazy001 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter Word : ");
		String word = s.next();
		StringBuffer alteredWord = new StringBuffer();
		
		for(int i=0 ; i<word.length() ; i++)
		{
			if(i == word.length()-1)
				alteredWord.append(word.charAt(i)).append(word.charAt(i));
			else if(word.charAt(i)==word.charAt(i+1))
			{
				
				alteredWord.append(word.charAt(i)).append(word.charAt(i+1));		
				i++;
			}
			else
				alteredWord.append(word.charAt(i)).append(word.charAt(i));		
		}
		
		System.out.println("Original String : "+word);
		System.out.println("Expected String : "+alteredWord);
		s.close();
	}
}
