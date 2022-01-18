package Learn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapinterface_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm= new HashMap<Integer,String> ();
		
		hm.put(1, "test1");
		hm.put(2, "test2");
		hm.put(3, "");
		System.out.println(hm);
		
		System.out.println(hm.get(2));
		
		Set hset=hm.entrySet();
	   Iterator it=	hset.iterator();
	
	
	while(it.hasNext())
	{
		
		Map.Entry  Mp=(Map.Entry)it.next();
		System.out.println( Mp.getKey()); 
		System.out.println(Mp.getValue());
	}
}
}