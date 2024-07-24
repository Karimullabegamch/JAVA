package Array_ss;

public class Duplicates {
public static void main(String[] args) {
	int arr[]= {2,3,4,2,3,7,7,6};
	for(int i=0;i<arr.length;i++)
	{
		int c=1,v=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]==arr[j] && i<j) c++;
			if(arr[i]==arr[j] && i>j) v++;
		}
		
		//if( v==0) // all elements one time
		//if( v==1)// duplicate elements
		if(v==0 && c==1)// unique elements
		{
			System.out.println(arr[i]);
		}
	}
}
}
