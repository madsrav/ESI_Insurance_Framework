package practice;


class Demo1 {	
	String bird;
	public Demo1() 
	{
		this("dove");
	}
	public Demo1(String bird)
	{		
		this.bird=bird;
		System.out.println(bird+"bird is singing a song");
	}
	public void demo()
	{
		System.out.println("bird is peacock");
	}
}

class Demo extends Demo1	
{
	public Demo()
	{
		super();
		super.demo();
		System.out.println("sagar is singing song");
	}
	public void Super(String hero)
	{
		super.demo();	
	}
}
public class Superman{
	public static void main(String args[])
	{
		Demo d= new Demo();
		d.demo();
		d.Super("hero");
	}
}
