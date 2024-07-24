package com.pack1;

public interface InterfaceA {
  
	void meth1();
	public static int meth2()
	{
		System.out.println("hello");
		return 3;
	}
	public static void main(String[] args) {
		System.out.println("hii");
		InterfaceA.meth2();
	}
	
}
