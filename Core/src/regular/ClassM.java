package regular;

import java.util.Arrays;

public class ClassM {
	public int[] makeEnds(int[] nums)
	{
	  return new int[] {nums[0],nums[nums.length-1]};
	}
public static void main(String[] args) {
	ClassM mobj=new ClassM();
	int input[]= {1,11,3,9};
	int res[]=mobj.makeEnds(input);
	System.out.println(Arrays.toString(res));
}

}
