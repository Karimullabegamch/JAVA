package Arrays_C;

import java.util.Arrays;
import java.util.Scanner;

public class DelElemnt {
public static void main(String[] args) {
	int arr[]= {1,3,4,2,44};
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the postiton where you want to del");
	int pos=sc.nextInt();
	
	if(pos>arr.length)
	{
		System.out.println("enter correct pos");
	}
	else
	{System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			if(i==(pos-1))
			{
				for(int j=i;j<pos;j++)
				{
					arr[j]=arr[j+1];
				}
			}
		}
		
	}
	System.out.println(Arrays.toString(arr));
	
}
}
