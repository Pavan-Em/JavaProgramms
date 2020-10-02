package LEVEL1;
import java.util.*;
										//we should do this for hashset alos convert to linkedlist sort then display thats the only solution
public class treemapsortbyvalues {
	
	String name;
	int id;
	double salary;
	
	public treemapsortbyvalues( String name , int id , double salary )
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public static void main(String[] args) 
	{
		Map<Integer, treemapsortbyvalues> obj=new TreeMap<Integer , treemapsortbyvalues>();
		obj.put(1, new treemapsortbyvalues("Pavan", 2, 90000));
		obj.put(5, new treemapsortbyvalues("Kera", 3, 50000));
		obj.put(4, new treemapsortbyvalues("Jordan", 4, 50000));
		obj.put(2, new treemapsortbyvalues("Mille", 1, 50000));
		obj.put(3, new treemapsortbyvalues("Deeka", 5, 50000));
		System.out.println(obj);
		
		List<Map.Entry<Integer, treemapsortbyvalues>> list=new LinkedList<Map.Entry<Integer,treemapsortbyvalues>>(obj.entrySet());
		Collections.sort(list , new heycomparetor());
		for(Map.Entry<Integer, treemapsortbyvalues> m:list)
		{
			System.out.println(m.getKey()+"---->"+m.getValue());
		}
		
	
	}
	
	public String toString()
	{
		return "[ "+id+" , "+name+" , "+salary+" ]";
	}
	
	public int compare(Map.Entry<Integer, treemapsortbyvalues> obj1,Map.Entry<Integer, treemapsortbyvalues> obj2)
	{
		return obj1.getValue().id-obj2.getValue().id;
	}
}

class heycomparetor implements Comparator<Map.Entry<Integer, treemapsortbyvalues>>
{
	public int compare(Map.Entry<Integer, treemapsortbyvalues> obj1,Map.Entry<Integer, treemapsortbyvalues> obj2)
	{
		return obj1.getValue().name.compareTo(obj2.getValue().name);
	}
}
