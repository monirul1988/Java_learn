
public class overloading_scenarios2 {


	   void  display(Object a) {
		
		System.out.println("Object method");
	
	}



	
	  void display(String a) {
		System.out.println("String method");
		
	}



public static void main(String[] args) {
	overloading_scenarios2 o=new overloading_scenarios2();
	o.display('a'); //call object methosd--auto pro happen
	o.display("abc");//if have parent & child like obj-string, it called child func.
	

	}

}
