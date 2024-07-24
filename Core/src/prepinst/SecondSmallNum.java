package prepinst;

public class SecondSmallNum {

	String secondSmall()
	{
		int arr[]= {2,12,9,1,34,5,99};
		int small=arr[0];
		for(int i:arr)
		{
			if(small<i) // small >i
				small=i;
		}
		int sec_small=Integer.MIN_VALUE; //Integer.Max_value
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != small && arr[i]>sec_small) // arr[i]<sec_small
				sec_small=arr[i];
		}
		System.out.println(small +" first highest");
		return sec_small+" secnon highest";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(new SecondSmallNum().secondSmall());
	}

}
