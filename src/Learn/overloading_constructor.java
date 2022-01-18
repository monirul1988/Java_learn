package Learn;

public class overloading_constructor {
	
	//constructor not return any value.
	//constructor name same as class name
	//
	
	int a=0;
	int b=0;
	int c=0;
	
	
	overloading_constructor(){
		this.a=10;
		this.b=20;
		this.c=25;
		
	}
	
	overloading_constructor(int x, int y, int z){
		this.a=x;
		this.b=y;
		this.c=z;
		
	}
	
	public void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		
		
		overloading_constructor o=new overloading_constructor(5,10,15);
		o.display();
		overloading_constructor o1=new overloading_constructor();
		o1.display();
	
		// TODO Auto-generated method stub

	}

}
