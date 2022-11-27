package MethodOverriding;

public class Student1 {
	
	public void studentinfo() {
		System.out.println("I am Student1");
	}
	
}
public class Student2 extends Student1{
	
	@Override
	public void studentinfo() {
		System.out.println("I am Student2");
	}
	
}
public class Student3 extends Student1{

	@Override
	public void studentinfo() {
		System.out.println("I am Student3");
	}
	
}
public class Main {
	public static void main(String[] args)
	{
		Student1 st;
		
		st = new Student1();
		st.studentinfo();
		
		st = new Student2();
		st.studentinfo();
		
		st = new Student3();
		st.studentinfo();
	}
}
