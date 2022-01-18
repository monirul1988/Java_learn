package Inter;

public class inter_child implements inter1,inter2 {
	
	
	
	

	public static void main(String[] args) {
	
		inter1 i=new inter_child();
		i.display();
		
		inter2 i1=new inter_child();
		i1.display1();
		
		
		
	}

	@Override
	public void display() {
		System.out.println("I am interface");
		
	}

	@Override
	public void display1() {
		System.out.println("I am interface 2");
		
	}

}
