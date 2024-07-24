package regular;
import java.util.Arrays;
public class ClassL {
	public int[] middleWay(int[] a, int[] b)
	{
	    return new int[] {a[1],b[1]};
	}
	public static void main(String[] args) {
		ClassL lobj=new ClassL();
		int input1[]= {1,2,3};
		int input2[]= {3,5,9};
		int res[]=lobj.middleWay(input1, input2);
		System.out.println(Arrays.toString(res));
		
	}

}
