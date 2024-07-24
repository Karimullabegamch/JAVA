package regular;

public class ClassI {

	int meth3(int []arr)
	{
		if(arr.length>=2)
		{
			return arr[0]+arr[1];
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args) {
		ClassI aobj=new ClassI();
		System.out.println(aobj.meth3(new int[] {3,2,3,2,3}));
	}
}
