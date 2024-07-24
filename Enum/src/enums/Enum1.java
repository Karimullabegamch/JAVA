package enums;

import java.util.Arrays;

public enum Enum1 {
 red,black,white;
	 public static void main(String[] args) {
		System.out.println(Enum1.red);
		Enum1 arr[]=Enum1.values();
		System.out.println(Arrays.toString(arr));
		for(Enum1 x:arr)
			{System.out.println(x+" "+x.ordinal());
			}
			}
}

