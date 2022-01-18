package Learn;

public class overriding_chiled  extends overriding_parent{
	
	 public void display()
	{
		
		super.display(); //----call parent super class
		System.out.println("I am child sub class");
		
	}
	
	
	

	public static void main(String[] args) {
		
		overriding_chiled o=new overriding_chiled();
		o.display();
		
	}

}
