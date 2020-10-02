package LEVEL1;
				//frequcncy
public class frequency {
	public static void main(String[] args) {
		String st="heheheoyo jdkasd kaakdkkd";
		char[] ch=st.toCharArray();
		int[] count=new int[256];
		
		for(int i=0;i<ch.length;i++)
		{
			++count[ch[i]];
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0 && i!=' ')//filter space here
			{
				System.out.println(""+(char)i+"-->"+count[i]);
			}
		}
	}
}
