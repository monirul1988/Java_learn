package Learn;
import java.util.HashSet;
import java.util.Iterator;

public class hashsetexample {

	public static void main(String[] args) {
		
		//HashSet treeSet LinkedHashset
		//doesnot accept duplicate
		//order not quarantee--store random order
	
		HashSet<String> h =new HashSet<String>();
		h.add("USA");
		h.add("UK");
		h.add("INDIA");
		h.add("UK");
		
		//h.remove("INDIA");
		int s=h.size();
		System.out.println(s);
		Iterator<String> it=h.iterator();
		while(it.hasNext())
		{
			
			
			System.out.println(it.next());
		}
		
	//	System.out.println(h);
	//	System.out.println(s);

	}

}
