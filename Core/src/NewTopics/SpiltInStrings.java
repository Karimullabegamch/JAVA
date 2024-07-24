package NewTopics;

import java.util.Arrays;

public class SpiltInStrings {

	static void meth1()
	{
		String s="i am java developer";
		System.out.println(s);
		String s1[]=s.split(" ");
		System.out.println(Arrays.toString(s1));//[i, am, java, developer]
		String s2="begam mahi";
		char arr[]=s2.toCharArray();
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		meth1();
	}
}
