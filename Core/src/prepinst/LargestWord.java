package prepinst;

import java.util.StringTokenizer;

public class LargestWord {
	
static	int len=0;
static	String s1=" ";
	

	public static void main(String[] args) {
		
	
StringTokenizer st=new StringTokenizer("ja isverer ea "," ");
		
		while(st.hasMoreTokens())
		{
			String s=st.nextToken();
			if(s.length()>len)
			{
				len=s.length();
				s1="";
				s1=s1+s;
			}
			

		}
		System.out.println (len);
		System.out.println(s1);
		
	}
}
