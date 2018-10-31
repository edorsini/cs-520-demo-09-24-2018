package demos.datastructures;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		/* ........... Normal Array............. */
		int[] arr = new int[2];
		arr[0] = 1;
		arr[1] = 2;
		System.out.println(arr[0]);

		/* ............ArrayList.............. */
		// Create an arrayList with initial capacity 2
		ArrayList<Integer> arrL = new ArrayList<Integer>(2);

		// Add elements to ArrayList
		arrL.add(1);
		arrL.add(2);

		// Access elements of ArrayList
		System.out.println(arrL.get(0));

		/* ........... Normal Array............. */
		// Need to specify the size for array
		int[] arr2 = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		// We cannot add more elements to array arr[]

		/* ............ArrayList.............. */
		// Need not to specify size
		ArrayList<Integer> arrL2 = new ArrayList<Integer>();
		arrL2.add(1);
		arrL2.add(2);
		arrL2.add(3);
		arrL2.add(4);
		// We can add more elements to arrL

		System.out.println(arrL);
		System.out.println(Arrays.toString(arr2));
	}
}
