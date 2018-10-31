package demos.datastructures;

// An array is basic functionality provided by Java

// array members are accessed using []

public class _01_Arrays {

	public static void main(String[] args) {
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		arr[9] = 100;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
