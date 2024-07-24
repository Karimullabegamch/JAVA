package Array_ss;

public class SearchingEle {
public static void main(String[] args) {
	int arr[]= {4,5,6};
	int c=0;
	if(arr.length==1) {
		System.out.println(arr[0]);
	}
	else {
		for(int x:arr)
		{
			if(x==2 || x==3)
			{
				c=c+1;
			}
		}
		//if(c==2)
		if(c==0)
		System.out.println("no 3 oor 2");
		else
			System.out.println(" founds");
	}
}
}
