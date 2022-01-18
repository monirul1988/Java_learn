
public class overloading_scenarios4 {


	   void  display(int  a, float b) {
		
		System.out.println("int float method");
	
	}



	
	  void display(float  a, int b) {
		System.out.println("float int  method");
		
	}
	  void  display(String  a, float b) {
			
			System.out.println("String float method"); ///it can promote as string/float are diff., but int & float not auto promot
		
		}



public static void main(String[] args) {
	overloading_scenarios4 o=new overloading_scenarios4();
	//o.display('a'); //
	o.display(10,20.5f);//
	o.display(20.5f,20); //
	o.display("abc", 10);
	//o.display(20,10;--it ambiguous error--not auto promot happen
	
	

	}

}
