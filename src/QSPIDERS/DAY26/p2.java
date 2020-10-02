package QSPIDERS.DAY26;
							/* Converting String number("1234") into interger number (1234)  */
public class p2 {
	public static void main(String[] args) {
		
		String sn = "12a34";
		System.out.println("String Number  : "+sn);
		try
		{
			int num = 0;
			for(int i=0 ; i<sn.length() ; i++)
			{
				if(sn.charAt(i)<'0' || sn.charAt(i)>'9')
					throw new Exception();
				num=num*10+(sn.charAt(i)-'0');
			}
			
			System.out.println("Integer Number : "+num);
		}catch(Exception e)
		{
			System.out.println("Input Should have only Numbers");
		}
	}
}
