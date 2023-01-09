//print bigger number from 2 given numbers

package practice;
import java.util.Scanner;
public class Program8 {	
	public void bigNum()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter two numbers");
		int x= sc.nextInt();
		int y=sc.nextInt();
		
		if(x>y)
		{
			System.out.println(x);
		}
		else
		{
			System.out.println(y);
		}		
	}
	public static void main(String[] args) {
		Program8 p8 = new Program8();
		p8.bigNum();
	}
}
