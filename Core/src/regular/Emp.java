package regular;
public class Emp {
	void empSal(float sal,float exp)
	{
		if (exp>5)
		{
			float bonus=(sal*5)/100;
			float totalSal=sal+bonus;
			System.out.println("Congratualtion your received bonus of "+bonus+"rupees");
			System.out.println("Now your sal is "+totalSal);	
		}	
	}
	public static void main(String[] args) {
		new Emp().empSal(45000.0f, 6.5f);
		System.out.println("---------------");
		new Emp().empSal(4500, 8);
	}

}
