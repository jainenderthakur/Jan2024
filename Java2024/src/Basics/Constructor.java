package Basics;

public class Constructor {
	
	public Constructor()
	{	
		this(1, 2, 3);
		System.out.println("Default Constructor");
	}
	
	public Constructor(int a)
	{   
		this();
		System.out.println("One parameterized Constructor");
	}
	
	public Constructor(int a, int b)
	{
		this(1);
		System.out.println("Two parameterized Constructor");
	}
	
	public Constructor(int a, int b, int c)
	{
		System.out.println("Three parameterized Constructor");
	}
	
	public Constructor(int a, int b, int c, int d)
	{   
		this (1, 2);
		System.out.println("Four parameterized Constructor");
	}

	public static void main(String[] args) {
		
		Constructor obj=new Constructor(1, 2, 3, 4);

	}

}
