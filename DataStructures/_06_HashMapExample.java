package demos.datastructures;

import java.util.HashMap;

public class _06_HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
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
