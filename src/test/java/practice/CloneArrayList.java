//how to copy/clone the arraylist
package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CloneArrayList {

	public static void main(String[] args) {
		 
		        // Create a list
		        List<String> original = Arrays.asList("iam","an","engineer");
		  
		        // Clone the list
		        List<String> cloned_list= new ArrayList<String>(original);
		  
		        System.out.println(cloned_list);
		   
	}

}
