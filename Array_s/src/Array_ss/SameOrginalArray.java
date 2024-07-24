package Array_ss;

import java.util.Arrays;

public class SameOrginalArray {

	public static void main(String[] args) {
		int arr[]= {2,3,3};
//		int b[]=new int[(arr.length)*2];
//		b[b.length-1]=arr[arr.length-1];
//		System.out.println(Arrays.toString(b));
		int temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		System.out.println(Arrays.toString(arr));
		
	}
}
