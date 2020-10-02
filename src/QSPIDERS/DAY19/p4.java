package QSPIDERS.DAY19;
						/* WAP to print occurence of Element in the String  */
public class p4 {
	public static void main(String[] args) {
		String st = "aassas4a aak".replaceAll(" ", "");
		char[] sentence = st.toCharArray();
		printOccurence(sentence);
	}
	
	public static void printOccurence(char[] sentence)
	{
		   
		int n=sentence.length;
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(sentence[i]==sentence[j])
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
			System.out.println(sentence[i]+" is Occuring "+(count)+" Times");
		}
	}
}
