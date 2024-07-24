package prepinst;

public class SmalAndLargInArray {

	
	void larElemnt()
	{
		int arr[]= {2,3,12,4,199,41,6,1};
		int max=arr[0];
		for(int i:arr)
		{
			if(i>max) // if(i<max)
			{
				max=i;
			}
		}
		System.out.println(max+" is largest");
		int min=arr[0];
		for(int i:arr)
		{
			if(i<min) // if(i<max)
			{
				min=i;
			}
		}
		System.out.println(min + " is smallest");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SmalAndLargInArray().larElemnt();
	}

}
