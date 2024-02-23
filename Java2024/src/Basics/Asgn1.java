package Basics;

public class Asgn1 {
	
	public int add(int a, int b)
	{
		int sum;
		return sum=a+b;		
	}
	
	public int sub(int a, int b)
	{
		int res;
		return res=a-b;		
	}
	
	public int mul(int a, int b)
	{
		int res;
		return res=a*b;		
	}
	
	public void div(int a, int b)
	{
		int res=a/b;
		System.out.println("Result is: " +res);
	}
	
	public static void main(String[] args) {
		
		Asgn1 obj=new Asgn1();
		
		int Sum1=obj.add(10, 2);
		int Sum2=obj.add(Sum1, 2);
		int Sub1=obj.sub(Sum2, 2);
		int Mul1=obj.mul(Sub1, 2);
		obj.div(Mul1, 2);
	}

}