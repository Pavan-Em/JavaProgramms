package QSPIDERS.DAY17;

import java.util.Arrays;
import java.util.Scanner;

					  /* WAP to Insert,Replace and Delete an element in Specified Position of the given Array */
public class p4 {
	public static void main(String[] args) {
		int[] num= {1,5,6,7,4};
		System.out.print("ORIGINAL ARRAY           : ");
		System.out.println(Arrays.toString(num));
		Scanner s=new Scanner(System.in);
		
		System.out.print("\nEnter Number to Insert   : ");
		int element = s.nextInt();
		System.out.print("Enter the Position       : ");
		int position = s.nextInt();
		int[] insert = insertElement(num, element, position);
		System.out.println(Arrays.toString(insert));
		
		System.out.println("============================================");
		System.out.print("Enter Number to Replace : ");
		int element1 = s.nextInt();
		System.out.print("Enter the Position       : ");
		int position1 = s.nextInt();
		int[] replace = replaceElement(num, element1, position1);
		System.out.println(Arrays.toString(replace));
		
		System.out.println("============================================");
		System.out.println("Delete Element by Position");
		System.out.println("Original Array         : "+Arrays.toString(num));
		System.out.print("Enter the Position       : ");
		int position2 = s.nextInt();
		int[] Deletep = deleteElementByPsition(num, position2);
		System.out.println("New Array              : "+Arrays.toString(Deletep));
		
		System.out.println("============================================");
		System.out.println("Delete Element by Element");
		System.out.println("Original Array         : "+Arrays.toString(num));
		System.out.print("Enter the Element        : ");
		int element2 = s.nextInt();
		int[] DeleteE = deleteElementByElemnt(num, element2);
		System.out.println("New Array              : "+Arrays.toString(DeleteE));
		
	}
	
	//Insert element
	public static int[] insertElement(int[] num,int element ,int position)
	{
		int n=0;                                       //----> use this n as index for num Array
		System.out.print("New Inserted Array        : ");
		int[] insert = new int[num.length+1];
		for(int i=0;i<insert.length;i++)               //--> i < insert.length  bcoz insert.length > num.length
		{
			if(position==i+1)  //Take care of This 
			{
				insert[i]=element;
			}
			else
			{
				insert[i]=num[n++];
			}
		}
		return insert;
	}
	
	//Replace Element
	public static int[] replaceElement(int[] num,int element,int position)
	{
		int[] replace = new int[num.length];
		System.out.print("New Replaced Array        : ");
		for(int i=0;i<num.length;i++)
		{
			if(position==i+1)
				replace[i]=element;
			else
				replace[i]=num[i];
		}
		return replace;
	}
	
	//Delete Element by Position
	public static int[] deleteElementByPsition(int[] num, int position)
	{
		int[] Deletep = new int[num.length-1];
		int count = 0;
		for(int i=0;i<num.length;i++)
		{
			if(position==i+1)		
				continue;
			else
				Deletep[count++]=num[i];
		}
		return Deletep;
	}
	
	//Delete Element by Element
	public static int[] deleteElementByElemnt(int[] num,int element)
	{
		int[] DeleteE = new int[num.length-1];
		int count = 0;
		for(int i=0;i<num.length;i++)
		{
			if(element==num[i])	
			{
				continue;
			}
			else
				DeleteE[count++]=num[i];
		}
		return DeleteE;
	}
}
