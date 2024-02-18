package Collectiondeom;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HastableDemo {
	public static void main(String[] args) {
		
		//Hashtable t= new Hashtable(); // capacity is 11, load factor 0.75
		
		//Hashtable t= new Hashtable(initial capacity); // create hashtable object with some capacity
		
		//Hashtable t=new Hashtable(Initial capacity, fill ratio/load facter);
		
		Hashtable<Integer, String> t=new Hashtable<Integer, String>();
		t.put(101, "mojammil");
		t.put(102,"mohan");
		t.put(103, "smit");
		//t.put(null, "x");// NullPointerException
		//t.put(104, null);//NullPointerException
		
		System.out.println(t);//{103=smit, 102=mohan, 101=mojammil}
		
		System.out.println(t.get(103));// smit
		
		t.remove(103);
		System.out.println(t);//{102=mohan, 101=mojammil}
		
		System.out.println(t.containsKey(102)); //true
		System.out.println(t.containsKey(104));//false
		
		System.out.println(t.containsValue("mojammil"));//true
		System.out.println(t.containsValue("raj"));// false
		
		System.out.println(t.isEmpty());//false
		
		System.out.println(t.keySet());// [102, 101]
		System.out.println(t.values());// [mohan, mojammil]
		
		/*for(int k:t.keySet()) 
		 * {
			System.out.println(k+"-----"+t.get(k));
			}*/
			
			// Entry specific method 
			
			/*for(Map.Entry entry:t.entrySet())// (key, value)
			{
				System.out.println(entry.getKey()+""+entry.getValue());	
			}*/
		
			// iterater
			
			Set s=t.entrySet();
			Iterator itr=s.iterator();
			while(itr.hasNext())
			{
				Map.Entry entry=(Entry) itr.next();// (101,x)
				System.out.println(entry.getKey()+" "+entry.getValue());
				
			}
	}

}
