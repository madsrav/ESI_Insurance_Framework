// copy Arraylist to array

package practice;
import java.util.ArrayList;
public class Program10 {

	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		list.add(1); // adding numbers into array list
		list.add(2);
		list.add(7);
		//list.add("raja");

		Object[] obj= list.toArray();//toArray() method returns an array of type Object(Object[]).
		for(Object value :obj)
		{
			System.out.println(value);
		}

		//		Integer[] arr = new Integer[list.size()];
		//		arr = list.toArray(arr);
		//
		//		for (Integer value : arr)
		//			System.out.println(value+" ");
	}

}
