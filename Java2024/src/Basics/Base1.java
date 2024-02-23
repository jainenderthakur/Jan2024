package Basics;

public class Base1 {
	
	int a;
	
	public void xyz()
	{
		System.out.println("Hello everyone");
	}
	
	public void abc()
	{
		System.out.println("Lets learn Automation");
	}
	
	public static void main(String[] args)
	{ 
		Base1 obj=new Base1();

		System.out.println(obj.a=2);
		obj.xyz();
		obj.abc();
				
	}
	
}