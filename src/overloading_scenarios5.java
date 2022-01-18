
public class overloading_scenarios5 {


	   void  display(int  a) {
		
		System.out.println("int  method");
	
	}



	
	  void display(int... a) {
		System.out.println("var argument");
		
	}
	  

public static void main(String[] args) {
	overloading_scenarios5 o=new overloading_scenarios5();
	o.display(5);
	o.display(10,20,30);
	

	}

}
