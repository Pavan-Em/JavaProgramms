package LEVEL1;

public class minmaxarray {
	public static void main(String[] args) {
		int[]  a= {5,9,7,6,4,56,98,14};
		int min=a[0];
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximun num:"+max);
		System.out.println("Minimun num:"+min);
	}
}
