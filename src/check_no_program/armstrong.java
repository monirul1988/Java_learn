package check_no_program;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter number");
		
		int num=sc.nextInt();
		int n=num;
			
		int cubesum=0;
		
		while(num!=0)
		{
			int  digit = num%10;
			cubesum= cubesum+digit*digit*digit;
			num= num/10;
			
		}	
		
		if (cubesum==n)
		{
			System.out.println("Num is armstrong number");
			
		}
		else
		{
			System.out.println("Num is not armstrong number");
		}
	}

}
