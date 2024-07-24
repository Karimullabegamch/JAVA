package com.pack1;


//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class ClassA{
 void meth1()
 {
    Scanner sc=new Scanner(System.in);
    int c=100;
    
    try {
    	System.out.println("enter with dew amnt");
        int w=sc.nextInt();
        System.out.println(w*3);
        
        throw new ArithmeticException("entered charactes");
        
    }
    catch(Exception e)
    {
    	System.out.println(e.getMessage());
    }
    finally
    {
    	System.out.println("finally");
    }
   sc.close();
    
 }
 public static void main(String[] args) {
    new ClassA().meth1();
 }
}