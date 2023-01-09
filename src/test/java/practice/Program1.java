//print the reverse of a string by using recursive algorithm
package practice;
public class Program1 {

	public static void main(String[] args)
	{

		//Initialize the String
		String str = "Reverse String";
		System.out.println("The entered string is: " + str);
		String rev = reverseString(str);
		System.out.println("The reversed string is: " + rev);
	}
	    //Recursive Function to Reverse the String
	public static String reverseString(String str)
	{
		//If entered string is empty
		//Return the empty string
		if (str.isEmpty())
			return str;
		//If string consists of multiple character    
		//Call the Function Recursively
		return reverseString(str.substring(1)) + str.charAt(0);
	}
}
