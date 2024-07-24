package regular;
import java.util.Arrays;
public class ClassK {
	public int[] maxEnd3(int[] nums)

	{
	    if (nums[0]>nums[1] && nums[0]>nums[2])
	    		return new int[] {nums[0],nums[0],nums[0]};
	    else if( nums[1]>nums[2])
	    		return new int[] {nums[1],nums[1],nums[1]};
	    return new int[] {nums[2],nums[2],nums[2]};
	}
public static void main(String[] args) {
	ClassK kobj=new ClassK();
	int input[]= {1,11,3};
	int res[]=kobj.maxEnd3(input);
	System.out.println(Arrays.toString(res));
}

}
