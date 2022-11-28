package SingleLevelInheritance;

public class Dad {
	int intelligent_level;
	String sur_name;
	
	public Dad(int intelligent_level, String sur_name)
	{
		this.intelligent_level=intelligent_level;
		this.sur_name=sur_name;
	}
	public String toString()
	{
		return ("Intelligent_level is: " + intelligent_level + "\nName is: " + sur_name);
	}
}

public class Son extends Dad {
	int age;
	
	public Son(int intelligent_level,String sur_name,int age)
	{
		super(intelligent_level, sur_name);
		this.age=age;
	}
	public String toString()
	{
		return (super.toString() + "\nage is: " + age);
	}
}

public class Main {
	public static void main(String[] args) {
		Son son = new Son(25, "xyz", 8);
		System.out.println(son.toString());
	}
}
