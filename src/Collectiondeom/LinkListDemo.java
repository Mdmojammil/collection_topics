package Collectiondeom;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo {
	public static void main(String[] args) {
		
		// decleare linklist
		
		//LinkedList l=new LinkedList();
		//LinkedList<Integer> l=new LinkedList<Integer>();
		//LinkedList<String> l=new LinkedList<String>();
		
		// Add element into the linklist
		LinkedList l=new LinkedList();
		
		l.add(100);
		l.add("welcome");
		l.add(10.5);
		l.add('A');
		l.add(true);
		l.add(null);
		
		System.out.println(l);//[100, welcome, 10.5, A, true, null]

		System.out.println(l.size());//6
		
		//remove
		l.remove(3);// index
		System.out.println("after removing new list"+l); //100, welcome, 10.5, true, null
		
		//inser/adding element in the middle of linklist
		
		l.add(3, "java");
		System.out.println("after inserting element"+l);// [100, welcome, 10.5, java, true, null]
		
		//retrive value/object
		
		System.out.println(l.get(3));// java
		
		// change element
		
		l.set(5, "x");
		
		System.out.println("after changing the value"+l);//[100, welcome, 10.5, java, true, x]
		
		// contaians()
		System.out.println(l.contains("java"));// true
		System.out.println(l.contains("python"));
		
		//isEmpty
		System.out.println(l.isEmpty());// flse
		
		// reading element from LL using for loop
		
		/*for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}*/
		
		// Reading element from LL using for each loop
		
		/*for (Object e1 : l) {
			System.out.println(e1);
			
		}*/
		
		// iterater() method
		
		Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
 
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
	}

}
