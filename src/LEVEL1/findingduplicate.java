package LEVEL1;

import java.util.Arrays;
import java.util.Scanner;

public class findingduplicate {
	public static void main(String[] args) {
		int count=0;
		int duplicate=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Sentence:");
		String sentence=s.nextLine();
		String[] st=sentence.split(" ");
		System.out.println(Arrays.toString(st));
		System.out.println("Duplicate Words are:");
		
		for(int i=0;i<st.length;i++)
		{
			count=1;
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i].equals(st[j]))
				{
					count++;
					st[j]="0";
				}
			}
			if(count>1 && st[i]!="0")
			{
				duplicate=1;
				System.out.println(st[i]);
			}
		}
		if(duplicate==0)
		{
			System.out.println("There is no Duplicte Words in the Sentecnce");
		}
	}
}
