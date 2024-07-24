package Array_ss;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingTwoDimensional {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{ 
			System.out.println("enter a number");
			    arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(arr));
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(arr[i][j]==4)
				{
					System.out.println(i+" "+j);
				}
			}
		}
		
	}
	
}
