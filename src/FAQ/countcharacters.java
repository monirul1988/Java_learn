package FAQ;

public class countcharacters {

	public static void main(String[] args) {
	
		
		 String s="I am automation engineer";
		char array[] = s.toCharArray();
		
		int i,j;
		int count ;
		 int len=s.length();
		 
		 for ( i=0;i<len;i++)
		 {
			 
			 
			 System.out.println(s.charAt(i));
			
				 
				 for ( j=1;j<=len;j++)
				 {
					  count=1;
					
					 if (s.charAt(i)==array[j])
					 {
						 
					    count=count+1;
					    array[j]=0;
					 }
					 
					
					 System.out.println("Charater " +s.charAt(i) + " is presenet "  + count+ " times" );	 
				 }
				
				 
			 
			 
			
		 }
		 
		 
		 
		 

	}

}
