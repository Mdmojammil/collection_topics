package Collectiondeom;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue<>();
		
		q.add("A");
		q.add("B");
		q.add("C");
		//q.offer("100");// not allow in queue( heterogenios data)
		q.offer(100);// allowed in queue(heterogenious data allowed)
		q.offer("C");
		
		System.out.println(q);// [A, B, C, C] insertion order preserve and duplicate allow
		
		// get head element element() peek()
		
		//System.out.println(q.element());//A return head element, if empty return nosuchelment exception
		//System.out.println(q.peek());// A returns head element if empty return null 
		
		
		// return and remove element from queue remove() poll()
		
		//System.out.println(q.remove());//A
		//System.out.println(q);// [B, C, C]
		
		//System.out.println(q.poll());
		//System.out.println(q);//[B, C, C]
		
		/*Iterator itr=q.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		for(Object object:q)
		{
			System.out.println(object);
		}
			
	}

}
