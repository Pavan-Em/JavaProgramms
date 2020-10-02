package QSPIDERS.DAY5;
					/* WAP to print Alphabet From A-Z Alternatively */
public class p1 {

	public static void main(String[] args) {
		char ch='a'+2;
		System.out.println(ch);
		for(char i='A';i<='Z';i++,i++)//don't use i=i+2 leads to CTE  //dont use i+=2 it use typecasting 
			System.out.println(i);
		
	}
}
