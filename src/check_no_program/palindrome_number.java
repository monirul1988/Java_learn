package check_no_program;

import java.util.Scanner;

public class palindrome_number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter number");
		
		int num=sc.nextInt();
		int n=num;
		
		int rev = 0; // 123
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
			
		if(rev==n)
		{
			System.out.println("number is palondrome number");
		}
		
		else
		{
			System.out.println("number is not palondrome number");
		}
			

	}

}
