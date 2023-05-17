package collection;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// Create a new LinkedList
		LinkedList<String> ll = new LinkedList<String>();
		// It has all the Arraylist methods as well as some of its own methods.
		ll.add("Pune");
		ll.add("Nashik");
		ll.add("Mumbai");
		ll.add("Dhule");
		System.out.println(ll);

		// 1. addFirst(): Used to add the first element in an linked list
		ll.addFirst("Aurangabad");
		System.out.println(ll);
		System.out.println(ll.get(0));

		// 2. addLast();
		ll.addLast("Nagpur");
		System.out.println(ll);

		// 3. getFirst(): Retrieving the first element
		// 4. getLast(): Retrieving the last element
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());

		// 5. removeFirst(): Removing the first element
		// 6. removeLast(): Removing last element
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		System.out.println(ll);

		// Iterating a linkedList
		// 1. For Loop
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println();
		//2. For Each loop / Enhanced for loop: 
		for(String s: ll) {
			System.out.println(s);
		}

	}

}
