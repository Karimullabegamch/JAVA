package regular;

public class ClassJ {

	public boolean firstLast(int[] nums)
	{
		if (nums[0]==6 ||  nums[nums.length-1]==6) 
		{
			return true;
		}
		else 
		
			return false;
	}
	public static void main(String[] args) {
		ClassJ jobj=new ClassJ();
		boolean res=jobj.firstLast(new int[] {1,2,6});
		System.out.println(res);
	}
}
