package Patterns;
/*
9 
7 9 
5 7 9 
3 5 7 9 
1 3 5 7 9 
 */

public class Pattern5 {

	public static void main(String[] args) {
	
		for(int i=9;i>=1;i=i-2)
		{
			for(int j=i;j<=9;j=j+2)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
