// print true if some of two numbers is a 3rd given number

package practice;

import java.util.Scanner;

public class Program9 {

	public static boolean sumTwoNum(int x, int y, int z)
	{
		return (((x+y)==z)||((y+z)==x)||((z+x)==y));
	}

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter three numbers");
		int x= sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		System.out.print("The result is: "+sumTwoNum(x, y, z));
	}
}
