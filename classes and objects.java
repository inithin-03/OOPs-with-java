package classesandobjects;

public class Student {
	String name;
	String branch;
	int Id_No;
	double cgpa;
	
	public void printStudentInfo()
	{
		System.out.println(this.name);
		System.out.println(this.branch);
		System.out.println(this.Id_No);
		System.out.println(this.cgpa);
	}
	
	public static void main(String[] args)
	{
		
		Student stu = new Student();
		
		stu.name = "Sai Ram";
		stu.branch = "ECE";
		stu.Id_No = 29361;
		stu.cgpa = 8.5;
		
		stu.printStudentInfo();
	
	}
}
