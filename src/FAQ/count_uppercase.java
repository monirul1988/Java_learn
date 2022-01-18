package FAQ;

public class count_uppercase {

	public static void main(String[] args) {
		String s1= "i AM automation engineer 1234 ";
		String s = s1.replace(" ", "");
		int length=s.length();
		char chars[] = s.toCharArray();
		int uppercase=0;
		int lowercase=0;
		int number=0;
		for (int i=0;i<s.length();i++)
		{
			
			if (chars[i]>='A' && chars[i]<='Z')
			{
				uppercase++;
				
			}
			else if (chars[i]>='a' && chars[i]<='z')
			{
				
				lowercase++;
			}
			else if (chars[i]>='0' && chars[i]<='9')
			{
				
				number++;
			}
			else
			{
				continue;
			}
			
		}
		
		float upercentage=(uppercase *100)/length;
		
		
		System.out.println("upper case number = "+ uppercase);
		System.out.println("lowercase case number = "+ lowercase);
		System.out.println("number case number = "+ number);
		
		System.out.println("upper case % = "+upercentage);
		
		

	}

}
