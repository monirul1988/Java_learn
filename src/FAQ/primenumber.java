package FAQ;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num=59;
		int j, count = 0;

		
			for (j = 2; j <= num - 1; j++) 
			{

				if (num % j == 0) 
				{
					count++;
					break;

				}

			}

			
            if (count > 0)
		    
{
			System.out.println(num + "is not a prime number");}
			
			else	
			{
            System.out.println(num + "is  a prime number");
			}
}
}
