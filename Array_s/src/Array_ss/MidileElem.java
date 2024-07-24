package Array_ss;

import java.util.Arrays;

public class MidileElem {

	public static void main(String[] args) {
		int a[]= {1,2,4};
		int b[]= {4,5,6};
		//int c[]= {a[1],b[1]};
		int c[]= {a[0],a[a.length-1]};
		System.out.println(Arrays.toString(c));
	}
}
