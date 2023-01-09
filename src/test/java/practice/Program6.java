// wap to print reverse of a string

package practice;

public class Program6 {

	public static void main(String[] args) {
	    String main= "sravan";
	    String rev="";
	    
	    for(int i=main.length()-1;i>=0;i--)
	    {
			char ch = main.charAt(i);// charAt() returns the character at given index
	    	rev = rev+ch;
	    }  
	    System.out.println(rev);
	}
}
