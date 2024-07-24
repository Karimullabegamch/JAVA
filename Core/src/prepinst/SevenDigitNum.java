package prepinst;

public class SevenDigitNum {

	void meth1()
	{
		for (int i=77;i<=1000;i++)
		{
			int num=i;
			
			
			while(num>0) 
			{int r=0;
				
				r=num%10;
				if(r==7)
				{
					System.out.print(i +" ");
					
					break;
				}
				
				num=num/10;
			}
			
			System.out.println();
		}
	}

	
		public static void main(String[] args) {
		new SevenDigitNum().meth1();
	}
}
