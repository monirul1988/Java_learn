
public class overloading_scenarios {
	
	

		public void  display(int a) {
			
			System.out.println("int method");
		
		}
	
	
	
		
		public  void display(String a) {
			System.out.println("String method");
			
		}
	
	

	public static void main(String[] args) {
		overloading_scenarios o=new overloading_scenarios();
		o.display('a'); //call int method----automatic promoti----from Char to int.---Scenerio 1
		
		

	
		}
		

}

