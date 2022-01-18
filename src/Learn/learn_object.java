package Learn;

public class learn_object {

	int a;
	int b;

	public void display() {

		System.out.println("value of a : " + a);
		System.out.println("value of b  :" + b);
	}

	/*
	 * learn_object(int c,int d) 
	 * { this.a=c; 
	 * this.b=d;
	 * 
	 * }
	 */

	void setdata(int c, int d) {

		this.a = c;
		this.b = d;
	}

	public static void main(String[] args) {

		/*
		 * learn_object l=new learn_object(); ----assign by class variable 
		 * l.a=10;
		 * l.b=20; 
		 * l.display();
		 * 
		 * learn_object l2=new learn_object(10,30); //assign by constructor
		 * l2.display();
		 */

		learn_object l2 = new learn_object(); // assign value in method
		l2.setdata(20, 30);
		l2.display();

	}

}
