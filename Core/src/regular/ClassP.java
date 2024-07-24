package regular;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassP {
	
	void fread() throws Exception 
	{
		FileInputStream fis=new FileInputStream("D:\\Core\\iostreams\\f1.txt");
		/*int i=fis.read();
		System.out.println(i);
		int j=fis.read();
		System.out.println(j);
		int k=fis.read();
		System.out.println(k);
		int l=fis.read();
		System.out.println(l);
		int m=fis.read();
		System.out.println(m);
		int n=fis.read();
		System.out.println(n);
		int o=fis.read();
		System.out.println(o);
		int p=fis.read();
		System.out.println(p);  upto this output will be like this 
97
98
99
100
101
102
-1
-1
		*/
		int i;
		while ((i=fis.read())!=-1)
			//System.out.println(i);97 98 99 100 101 102
			System.out.print((char)i);
		
	
	}
	
	void fcopy()  throws Exception
	{
		FileInputStream fis=new FileInputStream("D:\\Core\\iostreams\\f1.txt");
		FileOutputStream fos=new FileOutputStream("D:\\Core\\iostreams\\f2.txt");
		System.out.println("connection created");
		int i;
		
		while ((i=fis.read())!=-1)
		{
			fos.write(i);
		}
		
	}
	void fwrite()throws Exception
	{
		FileOutputStream fos=new FileOutputStream("D:\\Core\\iostreams\\f3.txt" ,true);
		String s="hii"+"heloo";
		byte arr[]=s.getBytes();
		fos.write(arr);
		
	}
	void ficopy()  throws Exception
	{
		FileInputStream fis=new FileInputStream("D:\\Core\\iostreams\\K B CH.jpeg");
		FileOutputStream fos=new FileOutputStream("D:\\Core\\iostreams\\copy.jpeg");
		System.out.println("connection created");
		int i;
		
		while ((i=fis.read())!=-1)
		{
			fos.write(i);
		}
		System.out.println("copied");
		fos.close();
	}
	public static void main(String[] args)  throws Exception {
		//new ClassP().fread();
		//new ClassP().fcopy();
		//new ClassP().fwrite();
		new ClassP().ficopy();
	}

}
