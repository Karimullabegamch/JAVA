package regular;

public class HelloWorld {

	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	
	    public static void main(String[] args) {


	  String nam="ashok";
	  String nam1="begam";
	  String dup="";
	  char c;
	//  System.out.println(nam.charAt(0));
	  for(int i=0;i<nam.length();i++)
	  {
	      for(int j=0;j<nam1.length();j++)
	      {
	          if(nam.charAt(i)==nam1.charAt(j))
	          {
	              c=nam.charAt(i);
	              dup=dup+c;
	          }
	          
	      }
	  }
	//  System.out.println(dup);
	  char c1[]={'a','c','d','e','f'};
	  String s=new String(c1,4,2);
	  System.out.println(s);
	  
	  
	  
	  
	    }
	}

