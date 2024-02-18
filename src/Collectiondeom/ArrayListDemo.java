package Collectiondeom;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		// decleare ArrayList
		//ArrayList<Integer> a1=new ArrayList<Integer>();
		//ArrayList<String> a1=new ArrayList<String>();
		//List a1=new ArrayList();
		
		ArrayList a1=new ArrayList();
		
		// add new element to the arrayList
		
		a1.add(100);
		a1.add("welcome");
		a1.add(15.5);
		a1.add('a');
		a1.add(true);
		
		System.out.println(a1);
		
		// size()
		System.out.println("number of element in the array list="+a1.size());
		// remove
		a1.remove(1);// 
		a1.remove("welcome");
		
		System.out.println("after removing the element from the array lias:"+a1);// [100, 15.5, a, true]
		
		// insert a new element
		// add(index, object)
		
		a1.add(2, "python");
		System.out.println("after inserting:"+a1);// [100, 15.5, python, a, true]
		
		// retreive specific element
		
		System.out.println(a1.get(2));
		
		// change element/replace
		a1.set(2, "c#");
		System.out.println("after replacing element"+a1);// [100, 15.5, c#, a, true]
		
		// serch- contains()- Return true/ flse
		
		System.out.println(a1.contains("c#"));// true
		System.out.println(a1.contains("c++"));// flse
		
		// isEmpty()
		System.out.println(a1.isEmpty());// flse
		
		//1> for loop
		
		//System.out.println(" reading element using for loop");
		/*for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
			
		}*/
		
		
		//2> for each loop
		
		//System.out.println("reading the element using for each loop");
		
		/*for (Object object : a1) {
			System.out.println(object);
			
		}*/
		
		
		//3> iterater()
		System.out.println("reading the elment using iterater");
		
		Iterator it=a1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()); // printing the element and move the next
			
		}
		
		
		
		
	}

}
