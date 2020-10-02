package LEVEL1;
			//first and second minimum num array
public class minarray {
	 public static void main(String[] args) {
		int[]  a= {6,-10,6,-11,-100,100};
		int min=a[0];
		int min2=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(min==min2)
			{
				try
				{
				    min2=a[i+1];
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					break;
				}
			}
		else if(a[i]<min)
			{
				min2=min;
				min=a[i];
			}
			
		else if(a[i]>min && a[i]<min2)
				min2 =a[i];
				
		}
		if(min != min2)
		{
			System.out.println("1st Samll num:"+min);
			System.out.println("2nd Small Num:"+min2);
		}
		else
		{
			System.out.println("Same elements in the array:"+min);
		}
	}
}
