package QSPIDERS.DAY6;
				    /* print 1 to 10 without using Lopp */
public class p4 {

	public static void main(String[] args) {
		
		int num=10;
		print(10);
	}
	
	public static int  print(int num)
	{
		if(num==0)
			return 0;
		num--;
		int p=print(num)+1;
		System.out.println(p);
		return p;
		
	}
}
