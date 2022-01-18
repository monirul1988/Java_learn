package Learn;

public class overloading {
	
	int x;
	int y;
	double z;
	String s1;
	String s2;




	public static void main(String[] args) {
		// TODO Auto-generated method stub
//class contain more than one method with same name---method overloading.
//class contain more than one constractor with same name---method overloading.		
		
		overloading o=new overloading();
		o.test(2, 4);
		o.test(4, 4.5);
		o.test("monirul","islam");
		
		
		
		
	}
	
	
	void test(int a, int b)
	{
		x=a;
		y=b;
		
		System.out.println(x+y);
		
		
	}
	
	void test(int a, double b)
	{
		x=a;
		z=b;
		
		
		System.out.println(a+b);
		
	
		
	}
	
	void test(String a, String b)
	{
		s1=a;
		s2=b;
		
		
		System.out.println(s1+s2);
		
		
	}
	
	

}
