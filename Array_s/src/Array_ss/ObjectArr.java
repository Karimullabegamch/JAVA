package Array_ss;

import java.util.Arrays;

public class ObjectArr {

	public static void main(String[] args) {
		Object o[]=new Object[4];
		o[3]="begam";
		o[2]=3;
		System.out.println(Arrays.toString(o));
		o[0]=new Prod(2,"beg");
		System.out.println(Arrays.toString(o));
		
	}
}
