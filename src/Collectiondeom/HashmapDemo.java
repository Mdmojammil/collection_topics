package Collectiondeom;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo {
	
	public static void main(String[] args) {
		
//		HashMap m=new HashMap<>();
		
		HashMap<Integer, String> m=new HashMap();
		
		m.put(101, "mojammil");
		m.put(102, "mohan");
		m.put(103, "raj");
		m.put(104, "moj");
		m.put(105, "rani");
		m.put(103, "x");
		m.put(106, "mojammil");
		
		System.out.println(m);//{101=mojammil, 102=mohan, 103=raj, 104=moj, 105=rani}
		
		System.out.println(m.get(101));//mojammil
		
		m.remove(106);// remove pair from hasmap
		System.out.println(m);
		
		System.out.println(m.containsKey(103));// true
		System.out.println(m.containsKey(109));// flse
		
		System.out.println(m.containsValue("moj")); //true
		System.out.println(m.containsValue("wasif"));// flse
		
		System.out.println(m.isEmpty());// flse
		
		System.out.println(m.keySet());// all the key as set fromate [101, 102, 103, 104, 105]
		
		for(int i:m.keySet())
		{
			System.out.println(i);
			
		}
		
		System.out.println(m.values()); // return all the value as collection [mojammil, mohan, x, moj, rani]
		
		for( String s1:m.values())
		{
			System.out.println(s1);
		}
		
		/*for(int i:m.keySet())
		{
			System.out.println(i+"-----"+m.get(i));
			
		}*/	
		// Entry methods
		//*****************
		
		/*for(Map.Entry entry :m.entrySet())
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());
				
		}*/
		
		// iterater()
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Entry) itr.next(); // 101 x entrey
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		
	}	

}
