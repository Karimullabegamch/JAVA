package regular;

public class ClassO {

	private	String ename;
	private float sal;
	private int exp;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp)
	{
		this.exp = exp;
	}

	void meth1() {
		if(exp>=5) {
		float incs=0.3f*sal;
		System.out.println("inc " +incs);
		sal=sal+incs;
		System.out.println("total sal is: "+sal);
		}
		else
		{
			System.out.println("total sal is: "+sal);
		}
	}
		
	
	
}