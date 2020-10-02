package LEVEL1;
import java.util.*;
public class duplictestring {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Sntence");
		String sen=s.nextLine().trim();
		duplicatestring(sen);
		System.out.println("========================");
		duplicatechar(sen);
	}
	
	static public void duplicatestring(String st)
	{
		String[] sec=st.split(" ");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(String s:sec)
		{
			if(map.get(s)!=null)
				map.put(s,map.get(s)+1);
			else
				map.put(s,1);
		}
		System.out.println("Duplicte String and Repitation Times");
		for(Map.Entry<String , Integer> m:map.entrySet())
		{
			if(m.getValue()>1)
			System.out.println(m.getKey()+"--->"+m.getValue()+" times");
		}
	}
	
	static public void duplicatechar(String st)
	{
		char[] ch=st.replaceAll(" ", "").toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character, Integer>();
		for(Character c:ch)
		{
			if(map.get(c)!=null)
				map.put(c,map.get(c)+1);
			else
				map.put(c,1);
		}
		System.out.println("Duplicte Chareters in the Sentence And Repitation times");
		for(Map.Entry<Character, Integer> m:map.entrySet())
		{
			if(m.getValue()>1)
			System.out.println(m.getKey()+"-->"+m.getValue()+" times");
		}
	}
}

























