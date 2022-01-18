package Learn;

import java.util.ArrayList;

public class arraylistlearn {

	public static void main(String[] args) {
		
		ArrayList<Integer> a= new ArrayList <Integer>();
		
		a.add(5);
		a.add(15);
		a.add(25);
		a.add(25);
				System.out.println(a);
		a.remove(2);
		System.out.println(a);
		
		
		
		int b=a.get(1);
		System.out.println(b);
		System.out.println(a.isEmpty());
	int c=a.size();
	System.out.println(c);	
	
	//arralylist,linkedlist,vector are List interface.
	//array is fixed size, arralylist is not fixed.
		
		

	}

}
