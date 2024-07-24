package Patterns;
//12345
//23451
//34512
//45123
//51234

public class Pattern3 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		int a=i;//2
		for(int j=1;j<=5;j++) {//4
			System.out.print(a++);//6
		if(a>5)//4>6
			a=1;
		}
		System.out.println();
	}
}
}
