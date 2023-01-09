//how to shuffle elements in an arraylist

package practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class ShuffleElementsInArrayList {

	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<Integer>();// creating an array list
	      list.add(1); // adding numbers into array list
	      list.add(2);
	      list.add(7);
	      list.add(8);
	      list.add(5);
	      list.add(9);
	     
	      ArrayList<String> li= new ArrayList();
	      li.add("raja");
	      li.add("rajesh");
	      
	      System.out.println("Original list : " + list+""+li); // printing the arraylist objects
	      Collections.shuffle(list); // shuffling the list
	      Collections.shuffle(li);
	      System.out.println("Shuffled list : " + list+""+li); // print the shuffled list 
	      shufflelist(list);
	}
	public static void shufflelist(ArrayList<Integer> list)
	{
		Random random = new Random();
		Integer a;
		int i=0;
		for(Integer v:list) {
		int num= random.nextInt(list.size()-1);
		Collections.swap(list, i, num);
//		a=v;
//		list.set(i, list.get(num));
//		list.set(num, a);
//		i++;
		}
		System.out.println(list);
	}
	
}
