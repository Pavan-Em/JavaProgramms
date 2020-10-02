package LEVEL1;

public class nrxtprime {
	public static void main(String[] args) {
		int num=19;
		num++;// dont forget this
		for(int i=2;i<num;i++)
		{
			if(num%2==0)
			{
				num++;
				i=1;
			}
			else
				continue;
		}
		System.out.println("Next Prime Num Is:"+num);
	}
}
