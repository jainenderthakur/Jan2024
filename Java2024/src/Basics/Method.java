package Basics;

public class Method {
	
	public void m()
	{
		System.out.println("Default method");
	}

	public void m1(int a)
	{
		System.out.println("One parameterized method");
	}
	
	public void m2(int a, int b)
	{
		System.out.println("Two parameterized method");
	}
	
	public void m3(int a, int b, int c)
	{
		System.out.println("Three parameterized method");
	}
	
	public void m4(int a, int b, int c, int d)
	{
		this.m3(1, 2, 3);
		System.out.println("Four parameterized method");		
		this.m();
		this.m1(1);
		this.m2(1, 2);
	}
	
	
	public static void main(String[] args) {
		
		Method obj=new Method();
		obj.m4(1, 2, 3, 4);
	}

}
