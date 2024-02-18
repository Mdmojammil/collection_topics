package Collectiondeom;

import java.util.HashSet;

public class HashSetDemo2 {
	public static void main(String[] args) {
		
		HashSet<Integer> evenumber=new HashSet<Integer>();
		evenumber.add(2);
		evenumber.add(4);
		evenumber.add(6);
		System.out.println("HashSet:"+evenumber);// [2, 4, 6]
		
		// addAll()
		
		HashSet<Integer> numbers=new HashSet<Integer>();
		numbers.addAll(evenumber);
		numbers.add(10);
		
		System.out.println("new HashSet:"+numbers);//[2, 4, 6, 10]
		// removeAll
		numbers.removeAll(evenumber);
		System.out.println(numbers);// [10]
		
		
		
		
		
		
	}

}
