package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {

//		ArrayList<String> state = new ArrayList<String>();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// The first data type is for storing the keys.
		// Second for storing the values.
		hm.put(1, "MH");
		hm.put(2, "GJ");
		hm.put(3, "UK");
		hm.put(4, "MP");

		System.out.println(hm);
		System.out.println(hm.size());
		//putAll(): Insert all the elements from a map to hashmap.
		System.out.println(hm.remove(1));
		System.out.println(hm.remove(3, "UK"));
		System.out.println(hm.remove(2, "DL"));
		System.out.println(hm);
		
		System.out.println(hm.replace(2, "AP"));
		System.out.println(hm);
		
		System.out.println(hm.get(2));
		hm.clear();
		System.out.println(hm);

		for (Map.Entry m : hm.entrySet()) {
//			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}

//		for(String s: ll) {
//			System.out.println(s);
//		}

	}

}
