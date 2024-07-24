package Array_ss;

import java.util.Arrays;

public class MergeTwoArrays {

public static void main(String[] args) {
	int a[]= {1,2,3};
	int b[]= {4,5,6};
	int index=0;
	int c[]=new int[a.length+b.length];
	for(int x:a)
	{
		c[index++]=x;
	}
	for(int x:b)
	{
		c[index++]=x;
	}
	
	System.out.println(Arrays.toString(c));
}

	
			}
