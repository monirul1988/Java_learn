package Learn;

public class Call_by_value_Reference {
	
	//call by value
	 public static int  num=5;
	 
	 
	//call by value 
	 public void display(int num)
	 {
		 
		 num=num+40;  //local variable
	 }
	 
	 //CALL by ref.
	 
	 public void display1(Call_by_value_Reference num)
	 {
		 
		 Call_by_value_Reference.num=Call_by_value_Reference.num+40;  //local variable
	 }
	 

	public static void main(String[] args) {
		
Call_by_value_Reference c=new Call_by_value_Reference();
		c.display(c.num); //pass value, it only change the local variable, not class variable
		
//		Call_by_value_Reference c1=new Call_by_value_Reference();
//		c1.display1(c1);
		
		
		System.out.println(c.num);
		//System.out.println(c1.num);

	}}

