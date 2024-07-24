package prepinst;

import java.util.Scanner;

public class Factor {
	
void meth1()
{
	Scanner sc=new Scanner(System.in);
System.out.println("enter any number");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	if(n%i==0)
	{
		System.out.print(i+ " ");
	}
}
sc.close();
}
	
	public static void main(String[] args) {
		new Factor().meth1();
	}
}
