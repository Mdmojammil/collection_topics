package Collectiondeom;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		
		a1.add("x");
		a1.add("y");
		a1.add("z");
		a1.add("A");
		a1.add("B");
		a1.add("C");
		
		ArrayList a1_dup=new ArrayList();
		
		a1_dup.addAll(a1);
		
		System.out.println(a1_dup);// [x, y, z, A, B, C]
		
		a1_dup.removeAll(a1);
		System.out.println("after removing:" +a1_dup);
		
		// short.. collection.short
		
		System.out.println("element in the array list"+ a1);// [x, y, z, A, B, C]
		
		Collections.sort(a1);
		
		System.out.println("element the arraylist after short"+a1);// [A, B, C, x, y, z]
		
		Collections.sort(a1, Collections.reverseOrder());
		System.out.println("element in the array after shorting in reverse order"+a1);//[z, y, x, C, B, A]
		
		// shuffling- collection.shufle()
		
		Collections.shuffle(a1);
		
		System.out.println("elementin the array list after shuffling"+a1);// [y, x, C, A, z, B]
		
		
		
		
		
		
		
		
				
				
		
		

		
	}

}
