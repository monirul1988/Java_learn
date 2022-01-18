package FAQ;

public class primenumber_1_100 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int i;
		int j;

		for (i = 1; i <= 100; i++)

		{
			int count1 = 0;
			for (j = 2; j <= i - 1; j++)

			{

				if (i % j == 0) {
					count1++;
					break;

				}

			}

			if (count1 == 0)

			{
				System.out.println(i + "is  a prime number");
			}

		}

	}
}
