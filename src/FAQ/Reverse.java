package FAQ;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("enter the number:");
		int num=s.nextInt();
		
		int rev=0;
		
		while(num !=0)
		{
			rev=rev*10+num%10;
			num=num/10;
			
		}
		
      System.out.println(rev);
      
      Scanner s1 =new Scanner(System.in);
		
		System.out.println("enter the number:");
		int num1=s1.nextInt();
		
		StringBuffer sf=new StringBuffer(String.valueOf(num1));
		System.out.println(  sf.reverse());
		
		 Scanner s2 =new Scanner(System.in);
			
			System.out.println("enter the first number:");
			int num2=s2.nextInt();
			System.out.println("enter the second number:");
			int num3=s2.nextInt();
			int c=num2+num3;
			System.out.println(c);
			
			
	}
	
	
	
	
	

}
