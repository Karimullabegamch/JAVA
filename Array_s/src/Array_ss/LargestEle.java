package Array_ss;

public class LargestEle {

	public static void main(String[] args) {
		int max=Integer.MIN_VALUE;
		int arr[]= {34,2,39,2,10,22,88};
		for(int x:arr)
		{
			if(max<x)
				max=x;
		}
		System.out.println(max);
	}
}
