package Inheritance;

public class classB extends classA{
	
	void test()
	{
		
		System.out.println("I ma from child class");
	}
	
//	void display()
//	{
//		
//		System.out.println("I ma from child class");
//	}
//	
//	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		classB b=new classB();
		
		//b.display();   //we call static method 3 ways.
		//classA.display();
		display();
		b.show();
		b.test();
		
		classA a=new classB();
		a.show();
		a.display();
		
		//a.test--we dont get b method
		
	//classB c=new classA(); //--ITS NOT WORKING 
		
		

	}

}
