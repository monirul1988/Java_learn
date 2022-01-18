package innerclass;

import innerclass.ClassA.ClassC;

public class ClassA {
	
	
	
public class ClassC{
	
	public void show()
	{
		
		System.out.println("show 1");
		
		
	}
	
	static void show3()
	{
		
		System.out.println("static");
		
		
	}
	}
	
	
	
	public static void main(String[] args) {
		
		//ClassC c=new ClassC();----error as inner class.
		
	//	ClassA a=new ClassA();
	//	
	//	ClassC c= a.new ClassC();   --inner class set up
	//	c.show();
	
	
///static inner class---
	//	ClassA a=new ClassA();
//		ClassC c= new a.ClassC().
	//	c.show3();
	
		
	}
	
}

