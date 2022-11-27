package MethodOverloading;

public class Student {
	String name;
	double cgpa;
	
	public void printInfo(String name)
	{
		System.out.println("Name of student is :"+ name);
	}
	
	public void printInfo(double cgpa)
	{
		System.out.println("CGPA of student is :"+ cgpa);
	}
	
	public void printInfo(String name,double cgpa)
	{
		System.out.println("Name of student is :"+ name + " CGPA of student is :"+ cgpa);
	}
	
	public void printInfo(double cgpa,String name)
	{
		System.out.println("CGPA of student is :"+ cgpa+" Name of student is :"+name);
	}
}

package MethodOverloading;

public class Main {
	public static void main(String[] args)
	{
		Student stu = new Student();
		
		stu.printInfo("Virat");
		stu.printInfo(9.5);
		stu.printInfo("Virat", 9.5);
		stu.printInfo(9.5,"Virat");
	}
}
