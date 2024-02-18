package Collectiondeom;

import java.util.LinkedList;

public class LinkListDemo3 {
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
		l.add("dog");
		l.add("dog");
		l.add("cat");
		l.add("horse");
		
		System.out.println(l);// [dog, dog, cat, horse]
		
		l.addFirst("Tiger");
		l.addLast("elephent");
		
		System.out.println(l);// [Tiger, dog, dog, cat, horse, elephent]
		
		System.out.println(l.getFirst());// Tiger
		System.out.println(l.getLast());// Elephant
		
		l.removeFirst();
		l.removeLast();
		
		System.out.println("after removing first and last element"+l);
		
		
		
		
	}

}
