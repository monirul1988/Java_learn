package FAQ;

import java.util.Random;
import java.util.Scanner;

public class rand {

	public static void main(String[] args) {
	Random ran=new Random();
	System.out.println(ran.nextInt(68));
	
	System.out.println(Math.random());
	
	
	
	//factorial
	
	Scanner s=new Scanner(System.in);

	System.out.println("enter factorial number");
	 int num=	s.nextInt();
	 int fact=1;
	 
	for (int i=1;i<=num;i++)
	{
		fact=fact*i;
		
	}
	
	System.out.println(fact);
	

	}

}
