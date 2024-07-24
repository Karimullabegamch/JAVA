package demosession;
import java.util.ArrayList;
import java.util.Iterator;
public class ClassR {
 
	void meth1()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
				al.add(10);
				//al.add("java");
				al.add(null);
				al.add(10);
				//al.add('A');
				al.add(20);
				al.add(4);
				al.add(99);
				System.out.println(al);
			System.out.println(al.size());
			System.out.println(al.get(0));
			/*for(int i=0;i<=al.size()-1;i++)
			{ 
				System.out.print(al.get(i)+ " ");
			}
			System.out.println();
			for(int i=al.size()-1;i>=0;i--)
			{
				System.out.print(al.get(i)+" ");
			}System.out.println();
			for(Object o:al)
			{
				System.out.print(o+" ");
			}
			System.out.println();
				Iterator<Integer> i=al.iterator();
				while(i.hasNext())
				{
					System.out.print(i.next()+ " ");
				}
	*/
			System.out.println(al.isEmpty());
			//al.clear();
			//System.out.println(al.isEmpty());
			System.out.println(al.contains(99));
			ArrayList<Integer> al2=new ArrayList<Integer>();
			al2.add(4);
			al2.add(99);
			System.out.println(al.containsAll(al2));
			al.addAll(al2);
			System.out.println(al);
			System.out.println(al.remove((Object)99));
			System.out.println(al.remove(1));
			System.out.println(al);
			//System.out.println(al.remove(2));
			//System.out.println(al.removeAll(al2));
			System.out.println(al);
			System.out.println(al.retainAll(al2));
			System.out.println(al);
			
	}
	
	public static void main(String[] args) {
		new ClassR().meth1();
		
	}
}
