//wap to rotate one char in a string
// i/p="sravan"
// o/p="ravans"---->left rotation
// o/p="nsrava"---->right rotation

//solution  =  Simple Solution is to use a temporary string to do rotations.
//             For left rotation, first, copy last n-d characters, then copy first d characters in order to the temporary string. For right rotation, first, copy last d characters, then copy n-d characters. 
//  where d= no of characters need to rotate=1 
// where n= no of char in a string
package practice;

public class Program2 {
 
	static String leftrotate(String str, int d)
	{                   //d is no of char         //start index & end index
		String rot =str.substring(d) +str.substring(0, d);
		       //(ravan)(n-d)char              (s)d char
   
		return rot;
	}

	public static void main(String[] args) {
		String str1 = "sravan";
		String 	finaloutput =leftrotate(str1,1);
		System.out.println(finaloutput);

	}

}
