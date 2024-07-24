package Array_ss;

import java.util.Arrays;

public class TwoDimeArray {

	public static void main(String[] args) {
		int arr[][]=new int [][] {{1,6},{2,3}};
		
		for(int x[]:arr)
			System.out.println(Arrays.toString(x));
		
		for(int y[]:arr)
		{
			for(int z:y)
				System.out.println(z);
		}
		System.out.println(Arrays.deepToString(arr));
	}
	
	
}
