package FAQ;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String rev = "";
		String rev1 = "";

		int num = 1234;
		int rev_num = 0;

		String s = "welcome to selenium";

		int len = s.length();

		for (int i = len - 1; i >= 0; i--) {

			s.charAt(i);
			rev = rev + s.charAt(i);

		}

		System.out.println(rev);

		char c[] = s.toCharArray();

		for (int i = len - 1; i >= 0; i--) {

			rev1 = rev1 + c[i];

		}

		System.out.println(rev1);

		while (num != 0) {
			rev_num = rev_num * 10 + num % 10; // 1234-------4
			num = num / 10; // 123-------------

		}

		System.out.println(rev_num);
		
		
		
		StringBuilder sb=new StringBuilder(String.valueOf(rev_num));
		StringBuilder sb1=new StringBuilder(s);
	//	System.out.println(sb.reverse());
		System.out.println(sb.reverse());
		System.out.println(sb1);
		
		
	}

}
