package Basics;

public class Student {
	
	int rollno;
	int age;
	
	public void display1()
	{
		System.out.println("Hello everyone");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}

	public static void main(String[] args) {
		
		Student obj=new Student();
		obj.display1();
		obj.display2();
		
		obj.rollno=99;
		obj.age=30;
		
		System.out.println("Student roll number is: " +obj.rollno);
		System.out.println("Student age is: " +obj.age);
	}

}
