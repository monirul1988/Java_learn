package overriding;

public class overriding_child extends Overriding_parent {
	
	//SAME method name//diff class//no of arg are same//IS-A arch


	  void show()
	{
		System.out.println("I ma from overriding_child");
		
		
	}
	
	  void show123()
	{
		//super.show123(0); //called parent child firest
		System.out.println("I ma from Overriding_child_123");
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//	overriding_child c=new overriding_child();--//it call chilemethod--overload the parent method
	//	Overriding_parent p= new Overriding_parent();--it call parent method
		
	//	overriding_child p= new Overriding_parent();--it give erro.
		
		overriding_child c=new overriding_child();
		c.show();
		c.show123();
		c.show123(5);
	

	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		
	}

}
