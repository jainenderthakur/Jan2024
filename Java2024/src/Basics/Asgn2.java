package Basics;

public class Asgn2 {
	
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
		
	public int div(int a, int b)
	{
		int res;
		return res=a/b;
	}
	
	public static void main(String[] args) {
		
		Asgn2 obj=new Asgn2();
		
		int div1=obj.div(10, 2);
		int sub1=obj.sub(div1, 2);
		int sum1=obj.add(sub1, 2);
		int sub2=obj.sub(sum1, 2);
		int div2=obj.div(sub2, 2);
		
		System.out.println("Result is: " +div2);		
	}

}
