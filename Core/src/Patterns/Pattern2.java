package Patterns;

public class Pattern2 {

	public static void main(String[] args) {
		int l=1;
		for(int i=1;i<5;i++)
		{
			 for(int j=5-1;j>=i;j--)
			 {
				 System.out.print(" ");
			 }
			 char c='A';
			 for(int k=1;k<=l;k++)
			 {
				 if(k==1 || k==l || k==5)
				 System.out.print(c);
				 else
					 System.out.print(" ");
				 c++;
			 }
			 l=l+2;
			 System.out.println();
		 }
	}
}
