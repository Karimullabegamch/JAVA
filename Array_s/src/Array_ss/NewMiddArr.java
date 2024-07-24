package Array_ss;

import java.util.Arrays;

public class NewMiddArr {
	public static void main(String[] args) 
	{
	int []arr = {12,89,90,78,99, 56, 99};
//	System.out.println(arr[arr.length/2-1]);
//	System.out.println(arr[arr.length/2]);
//	System.out.println(arr[arr.length/2+1]);
	int len=arr.length/2;
	int b[]=new int[] {arr[len-1],arr[len],arr[len+1]};
	System.out.println(Arrays.toString(b));
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	}
}
