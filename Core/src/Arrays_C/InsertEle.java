package Arrays_C;

import java.util.Arrays;
import java.util.Scanner;

public class InsertEle {

	public static void main(String[] args) {
		int arr[]= {1,3,4,2,44};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the postiton where you want to del");
		int pos=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr.length;j>=pos;j--)
			{
				arr[j]=arr[i-1];
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
