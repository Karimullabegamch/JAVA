package Array_ss;

import java.util.Arrays;

class Prod
{
	private int id;
	private String name;
	
	public Prod(int id,String name)
	{
		this.id=id;
		this. name=name;
		
	}
	@Override
	public String toString()
	{
		return "id=" +id+ " name="+name+"";
	}
}
public class UseeDefObj {

	public static void main(String[] args) {
		Prod p[]=new Prod[5];
		p[1]=new Prod(1,"begam") ;
		p[2]=new Prod(2,"mahi") ;
		System.out.println(Arrays.toString(p));
		for(Prod x:p)
			System.out.println(x);
	}
	
	
}
