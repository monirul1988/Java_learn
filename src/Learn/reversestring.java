package Learn;

public class reversestring {
	
	public static void main(String[] args) {
		
		String str = "gnitseT erawtfoS";
        
        // Created a StringBuffer "sb" and stored all the characters of the String
        StringBuffer sb = new StringBuffer(str);
         
        // Reversed the occurrence of characters
        sb.reverse();
         
        // Printed the StringBuffer
        System.out.println(sb);
        
        
        
        char chars[] = str.toCharArray(); 
        
        for (int i = chars.length - 1; i >= 0; i--)
        {
            System.out.print(chars[i]);
        
        
        
        
        
        
		
		
		
	}

}
}