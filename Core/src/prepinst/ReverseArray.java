package prepinst;

import java.util.Arrays;

public class ReverseArray {
	int[] reverseOfArray()
	{
		int arr[]= {1,2,3,4};
		int reverse_arr[]=new int[arr.length];
		for(int i=arr.length-1, j=0;i>=0;i--,j++)
			reverse_arr[j]=arr[i];
		return reverse_arr;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(Arrays.toString(new ReverseArray().reverseOfArray()));
	}
}
