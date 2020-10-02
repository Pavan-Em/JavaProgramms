package QSPIDERS.DAY17;
						/* WAP to check given Array is Palindrome */
public class p3 {
	public static void main(String[] args) {
		int[] num = {1,5,6,6,5,1};
		boolean check = isPalindrome(num);
		if(check)
			System.out.println("Given Array is Palindrome ");
		else
			System.out.println("Givem Array is Not Palindrome");
	}
	
	public static boolean isPalindrome(int[] num)
	{
		int n=num.length/2;
		for(int i=0,j=num.length-1;i<n;i++,j--)
		{
			if(num[i]!=num[j])
				return false;
		}
		return true;
	}
}
