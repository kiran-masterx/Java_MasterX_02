package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcept {

	public static void main(String[] args) {

		// Creating an ArrayList
		ArrayList<String> state = new ArrayList<String>();
		
		//Adding elements in ArrayList
		state.add("MH");
		state.add("AP");
		state.add("MP");
		state.add("GJ");
		System.out.println(state);
		
		// Its index starts with 0, similar to array.
		// Accessing the elements from an array list
		System.out.println(state.get(1));
		//System.out.println(state.get(4)); -> IndexOutOfBoundsException
		
		//Updating an element
		state.set(1, "DL");
		System.out.println(state);
		
		//Removing an element
		state.remove(2);
		System.out.println(state);
		
		//size of an arraylist
		System.out.println(state.size());
		
		//Sorting an arraylist
		Collections.sort(state);
		System.out.println(state);
		
		//Iterating an arraylist
		for(int i = 0; i < state.size(); i++) {
			System.out.println(state.get(i) + " State");
		}
		
		for(String s : state) {
			System.out.println(s);
		}
	}

}
