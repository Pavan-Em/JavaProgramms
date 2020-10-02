package QSPIDERS.DAY24;
/*/ WAP to convert Words to Number 
 *   input --> 123456789
 *   output--> twelve crore thirty fout lakh fifty six thousand seven hundard eigthy nine
 *   
 *           twelve     crore
 *  thirty   four       lakh
 *  fifty    six        thousand
 *           seven      hundard
 *  eighty   nine
 *  
 * */

public class p1 {
	public static void main(String[] args) {
		int num=999;
		display(num);
		
	}
	public static void display(int num)
	{
		displayNumInWords(num/10000000," crore ");
		displayNumInWords(((num/100000)%100)," lakh ");
		displayNumInWords((num/1000)%100," thousand ");
		displayNumInWords((num/100)%10," hundard ");
		displayNumInWords((num%100),"");
		
	}
	
	public static void displayNumInWords(int num ,String s1 )
	{
		String[] one = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Therteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
		
		String[] two = { "", "", "Tewnty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty" };
		
		if(num<20)
			System.out.print(one[num]);
		else
			System.out.print(two[num / 10] + " " + one[num % 10]);
		
		//only print when num is greater then zero
		if(num>0)
			System.out.print(s1);
	}
}
