package QSPIDERS.DAY19;
					/* WAP to delete a repeated Element in the String  */
public class p1 {
	public static void main(String[] args) {
		String st = "aassas4a aak".replaceAll(" ", "");
		char[] sentence = st.toCharArray();
		String returnSentence = deleteDuplicate(sentence);
		System.out.println(returnSentence);
	}
	
	public static String deleteDuplicate(char[] sentence)
	{
		int count=0;   //----->to know number of duplictes 
		int n=sentence.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(sentence[i]==(sentence[j]))
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
				returnSentence+=sentence[i];
		}
		return returnSentence;
	}
}
