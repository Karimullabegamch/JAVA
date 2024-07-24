package prepinst;

public class LarEleInArray {

	int larElemnt()
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
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new LarEleInArray().larElemnt());
	}

}
