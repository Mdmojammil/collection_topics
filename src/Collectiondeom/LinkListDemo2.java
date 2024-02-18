package Collectiondeom;

import java.util.Collections;
import java.util.LinkedList;

public class LinkListDemo2 {
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
		l.add("x");
		l.add("y");
		l.add("z");
		l.add("A");
		l.add("B");
		l.add("C");
		
		LinkedList new_l=new LinkedList();
		new_l.addAll(l);
		System.out.println(new_l);// [x, y, z, A, B, C]	
		
		new_l.removeAll(l);
		System.out.println(new_l);// []
		
		// sort()... collection.sort(collection)
		
		System.out.println("before sorting"+l);//[x, y, z, A, B, C]
		Collections.sort(l);
		System.out.println("after sorting:"+l);// [A, B, C, x, y, z]
		
		// reverse order
		
		Collections.sort(l,Collections.reverseOrder());//[z, y, x, C, B, A]
		System.out.println("reverse order"+l);
		
		// shuffling
		Collections.shuffle(l);
		System.out.println("after shufling:"+l);// :[A, z, y, x, C, B]
		
		
		
		

	}

}
