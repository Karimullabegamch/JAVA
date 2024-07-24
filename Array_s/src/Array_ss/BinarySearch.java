package Array_ss;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {5,5,5,56};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		//int sele=5;
		System.out.println(Arrays.binarySearch(arr, 5));
		System.out.println(Arrays.binarySearch(arr, 85));
		
	}
}
