package Learn;

public class java_methods {

	public static void main(String[] args) {
		
		
		String myStr = "Hello";
		char result = myStr.charAt(0);
		System.out.println(result);


		String myStr1 = "Hello";
		String myStr2 = "Hello2";
		System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal
		
		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));
		
		String firstName1 = "John ";
		String lastName1 = "Doe";
		System.out.println(firstName1 + lastName1);
		
		String myStr11 = "Hello";
		System.out.println(myStr11.contains("Hel"));   // true
		System.out.println(myStr11.contains("e"));     // true
		System.out.println(myStr11.contains("Hi"));    // false

		
		String myStr111 = "Hello";
		String myStr21 = "Hello";
		String myStr3 = "Another String";
		System.out.println(myStr111.equals(myStr21)); // Returns true because they are equal
		System.out.println(myStr111.equals(myStr3)); // false

		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(txt.length());
		
		String myStr1111 = "Hello";
		System.out.println(myStr1111.replace('l', 'p'));
		
		String s= "Total number of pages (426)in the site";
		
		int firstindex=s.indexOf("(");
		int lastindex=s.indexOf(")");
		
		System.out.println(firstindex);
		System.out.println(lastindex);
		
		Integer.toString(firstindex);
		Integer.toString(lastindex);
		
		String sub= s.substring(firstindex+1, lastindex);
		System.out.println(sub);
		
		
				

}
}