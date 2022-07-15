package dilip.sample.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
	
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(100000);
		ll.add(10);
		ll.add(30);
		ll.add(20);
		ll.add(45);
		ll.add(62);
		ll.add(45);
		
		ll.add(2, 2222);
		
		for (Integer llval : ll) {
			System.out.println("linked list =>"+llval);
		}
		
	//	Iterator itr = ll.iterator();
		
		ll.removeFirst();
		for (Integer llval : ll) {
			System.out.println("first removed linked list =>"+llval);
		}
		
		ll.removeFirstOccurrence(20);
		for (Integer llval : ll) {
			System.out.println("first occurence of value 20 removed linked list =>"+llval);
		}
		
		Iterator itrDesc = ll.descendingIterator();
		
		while (itrDesc.hasNext()) {
			System.out.println("desc order => "+itrDesc.next());
		};
		
		System.out.println("\n index of 45 =>"+ll.indexOf(45));
		
		System.out.println("\n index of 332 =>"+ll.indexOf(332));
		
		Collections.sort(ll);
		System.out.println("\n Sorted Asc =>"+ll);
		
		Collections.sort(ll,Collections.reverseOrder());
		System.out.println("\n Sorted Desc =>"+ll);
		System.out.println("\n list Size =>"+ll.size());
		
	}
}
