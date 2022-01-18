package innerclass;

@FunctionalInterface
interface B {
	
	public void display();

}


// class c implements B {
//
//	@Override
//	public void display() {
//		System.out.println("Implement class");
//		
//	}
//	
//	  //    ()->{System.out.println("Implement class");}
//}






public class lamda  {

	public static void main(String[] args) {
		
		B b= ()->{System.out.println("Implement class");};
		
		
		
		b.display();
		
				

	}



	
	

}
