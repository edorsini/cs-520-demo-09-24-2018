package demos.datastructures;

import java.util.ArrayList;

// ArrayList is part of collection framework in Java

// ArrayList has a set of methods to access elements and modify them

// Array is a fixed size data structure while ArrayList is not

// One need not to mention the size of Arraylist while creating its object. Even if we specify some initial capacity, we can add more elements.

// Since ArrayList can’t be created for primitive data types, members of ArrayList are always references to objects at different memory locations. Therefore in ArrayList, the actual objects are never stored at contiguous locations. References of the actual objects are stored at contiguous locations.

// In array, it depends whether the arrays is of primitive type or object type. In case of primitive types, actual values are contiguous locations, but in case of objects, allocation is similar to ArrayList.

public class _02_ArrayLists {
	public static void main(String[] args) {

		ArrayList<String> cars_list = new ArrayList<String>();

		cars_list.add("Ferrari");
		cars_list.add("Truck");
		cars_list.add("Prius");
		cars_list.add("Mini van");

		System.out.println(cars_list);

	}
}
