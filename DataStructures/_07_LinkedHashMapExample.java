package demos.datastructures;

import java.util.LinkedHashMap;

public class _07_LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		hm.put(100, "Joe");
		hm.put(101, "Ed");
		hm.put(102, "Michael");

		System.out.println(hm);

//		for (Map.Entry m : hm.entrySet()) {
//		System.out.println(m.getKey() + " " + m.getValue());
//	}

		// Remove value for key 102
		hm.remove(102);
		System.out.println(hm);
	}

}
