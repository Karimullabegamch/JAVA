package NewTopics;

import java.util.Arrays;

public class TargetIndexes {

	int[] meth1(int arr[], int target)
	 {
	     int i=0,sum=0;
	 int j=arr.length-1;
	 
	 while(i<j)
	 {
	     sum=arr[i]+arr[j];
	     if(sum<target)
	     {
	         i++;
	     }
	     else if(sum>target)
	     {
	         j--;
	     }
	     else
	     {
	         return new int[] {arr[i],arr[j]};
	     }
	     
	 }
	 return new int []{-1,-1};
	 }
	 public static void main(String[] args) {
	     
	     int arr1[]={1,3,5,43,3};
	     int tar=66;
	     TargetIndexes obj=new TargetIndexes();
	     int ar[]=obj.meth1(arr1,tar);
	     System.out.println(Arrays.toString(ar));
	     
	     
	 }
	}

