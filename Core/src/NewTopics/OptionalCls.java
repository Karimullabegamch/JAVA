package NewTopics;

import java.util.Arrays;
import java.util.Optional;

public class OptionalCls {
public static void main(String[] args) {
	String arr[]=new String[4];
	arr[1]="begam";
	arr[0]="mahi";
	System.out.println(Arrays.toString(arr));
	System.out.println((arr[1]));
	//System.out.println((arr[3].toUpperCase()));
	Optional  o=Optional.ofNullable(arr[1]);
	System.out.println(o);
	System.out.println(o.get());
	System.out.println(o.isEmpty());
	System.out.println(o.isPresent());
	if(o.isPresent())
	{
		System.out.println(((String) o.get()).toUpperCase());
	}
	else
		System.out.println("its empty");

	
}

}
