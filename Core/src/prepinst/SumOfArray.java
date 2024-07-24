package prepinst;

public class SumOfArray {

	
	int sum()
	{
		int arr[]= {1,2,3,4};
		int sum=0;
		for(int i:arr)
			sum=sum+i;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(new SumOfArray ().sum());
	}
}
