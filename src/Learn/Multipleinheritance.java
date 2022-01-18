package Learn;


interface a
{
	int a=10;
	void m1();
	
	
}

interface b
{
	
	int b=20;
	void m2();
	
	
	
}


public class Multipleinheritance implements a,b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multipleinheritance m= new Multipleinheritance();
		m.m1();
		m.m2();

	}

	@Override
	public void m2() {
		System.out.println(b);
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println(a);
	}

}
