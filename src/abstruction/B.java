package abstruction;

public class B extends A{
	
	public void show()
	{
		System.out.println("Test2");
		
	}
	public static void main(String[] args) {
		A a=new B();
	
		a.show();

	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

}
