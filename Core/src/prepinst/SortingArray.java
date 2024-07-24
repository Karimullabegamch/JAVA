package prepinst;

import java.util.Arrays;

public class SortingArray {
 
	void sarray()
	{
		int arr[]= {44,2,11,3,55};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i]<arr[j])//if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new SortingArray().sarray();
	}

}
