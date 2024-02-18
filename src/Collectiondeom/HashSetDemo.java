package Collectiondeom;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		//HashSet hs= new HashSet(100)// initial capacity 100
		//HashSet hs= new HashSet(100, (float)0.90);
		//HashSet<Integer> hs= new HashSet<Integer>;
		
		HashSet hs= new HashSet();//default capacity 16 load facter 0.75
		
		hs.add(100);
		hs.add("welcome");
		hs.add(16.4);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);//[null, welcome, 16.4, A, true, 100]
		
		// remove
		hs.remove(100);
		System.out.println("after removing"+hs);//[null, A, 16.4, welcome, true]
		
		//contains
		
		System.out.println(hs.contains("welcome")); // true
		System.out.println(hs.contains("xyz"));// flse
		
		//isEmpty
		System.out.println(hs.isEmpty());// flse
		
		
		
		// reading the object element from the hashset using for .. each loop
		
		/*for(Object object: hs) {
			System.out.println(object);
			
		}*/
		
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		
		
	}

}
