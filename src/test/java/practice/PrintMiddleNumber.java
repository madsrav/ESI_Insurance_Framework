package practice;

public class PrintMiddleNumber {
		// Function to find the middle of three number
		public static int middleOfThree(int a, int b,
											int c)
		{
			
			// Checking for b
			if ((a < b && b < c) || (c < b && b < a))
				return b;

			// Checking for a
			else if ((b < a && a < c) || (c < a && a < b))
			return a;

			else
			return c;
		}
		public static void main(String[] args)
		{
			int a = 1, b = 0, c = -1;
			int middle;
			middle=(a>b)?((a<c)?a:((b>c)?b:c)):((b<c)?b:((a>c)?a:c));
			System.out.println(middle);
			System.out.println( middleOfThree(a, b, c) );
		}
	}

