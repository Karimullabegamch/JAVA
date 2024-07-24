package regular;
public class ClassF {
	static int a;
	void meth1(String name) {
		if(name=="begam")
		{
			int age=25;
			if(age<18) {
				System.out.println("your not eligile to vote now");
			}
			else {
				int k=0;
				switch(k) {
				case 1:
					System.out.println("value of k is" +k);
					break;
					
				case 0:
					while(a==0) {
						do {
							
							for(;a<=10;a++)
							{
								System.out.println("value of a is " +a);
							}
						}while(a<10);
						a++;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		new ClassF().meth1("begam");
	}
}