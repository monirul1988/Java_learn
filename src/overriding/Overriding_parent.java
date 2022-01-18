package overriding;

public abstract class Overriding_parent {
	
	//ACCESS modier : Parent<=child class.
	//retuen type  : parent>=child class
	//for abstract /intercface you need to override in chils class
	//static,private,final method never override.

 void show()
	{
		
		System.out.println("I ma from Overriding_parent");
		
	}
	
	
	public  void show123(int x)
	{
		
		System.out.println("I ma from Overriding_parent_123");
		
	}
	
	abstract void display();
		
		
	
}
