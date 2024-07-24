package regular;

public class ClassH {

	char[] meth1(int arr[],String []data,String msg)
	
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+ " ");
		System.out.println();
		for(int i=0;i<data.length;i++)
			System.out.print(data[i]+ " ");
		System.out.println();
		return new char[] {'a','b'};
	}
	public static void main(String[] args) {
		ClassH hobj=new ClassH();
		System.out.println(hobj.meth1(new int[] {1,2,3},new String[] {"begam","mahi"},"hii"));
		
	}
}
