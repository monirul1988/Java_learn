package Learn;

public class constructor_1 {
	
constructor_1(){
		
		System.out.println("constuctow with 0 para");
		
	}
	
	constructor_1(int x){
		this();
		
		System.out.println("constuctow with 1 para");
		
	}
	
	constructor_1(int x, int y){
		
		this(15);
		
		
		System.out.println("constuctow with 2 para");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor_1 c=new constructor_1(5,10);
	}

}
