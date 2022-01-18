package Learn;

public class static_learn {
	
	int a;
	static int  b ;
	
	 static void m1()
	 {
		System.out.println("i am from static method"); 
		 
	 }
	 
	 
	 
	 
	  void m2()
	 {
		System.out.println("i am from non static method"); 
	
	}
	  
	  void m3()
		 {
			System.out.println("i am from non static method"); 
			m1();
			m2();
			a=10;
			b=200; /////non static method call both static & non ststic method directly in side non ststic method.
		
		}
	

	public static  void main(String[] args) {
		b=100;
		System.out.println(b);  //static method & variable called without object creation.
		                        //static variable only use in static method
		m1();
		
		static_learn s=new static_learn();
		System.out.println(s.a);
		s.m1(); //static can also called by object.

	  
		
	


	}

}
