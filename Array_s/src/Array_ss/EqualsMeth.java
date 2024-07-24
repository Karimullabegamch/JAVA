package Array_ss;

import java.util.Arrays;

public class EqualsMeth {
public static void main(String[] args) {
	int a[]= {2,6};
	int b[]= {1};
	//System.out.println(Arrays.equals(a, b));
	//System.out.println(Arrays.compare(b, a));
	//System.out.println(Arrays.compare(a, a));//0
	//System.out.println(Arrays.compare(a,b));
	int c[]= {2,3,4,1,5,33,2,1,35};
	int copy[]=Arrays.copyOf(c, 2);
	System.out.println(Arrays.toString(copy));
	System.out.println(c.getClass().getName());
	
}
}
