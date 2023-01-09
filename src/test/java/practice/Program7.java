//print the string first half and second half separately
package practice;

public class Program7 {

	public static void main(String[] args)
	{
		String str= "sravan";
		String sum="";
		int num=str.length();
		for(int i=str.length()-1;i>=num/2;i--)
		{
			String s=sum+str.charAt(i);
			System.out.println(s);	
		}
		System.out.println("");
		for(int i=(num-1)/2;i>=0;i--)
		{
			String s2=sum+str.charAt(i);	
			System.out.println(s2);
		}
	}
}
