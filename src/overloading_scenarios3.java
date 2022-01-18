
public class overloading_scenarios3 {


	   void  display(StringBuffer a) {
		
		System.out.println("StringBuffer method");
	
	}



	
	  void display(String a) {
		System.out.println("String method");
		
	}



public static void main(String[] args) {
	overloading_scenarios3 o=new overloading_scenarios3();
	//o.display('a'); //
	o.display("abc");// string & string buffer are same level. both have parent object.
	o.display(new StringBuffer ("test")); //call string buffer call
	
	

	}

}
