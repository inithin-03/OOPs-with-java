package HierarchialInheritance;

public class Dad {
	public void dancing()
	{
		System.out.println("Dancing....");
	}
}

public class Mom extends Dad {
	public void run()
	{
		System.out.println("Running....");
	}
}

public class Son extends Dad {
	public void sleep()
	{
		System.out.println("Sleeping....");
	}
}

public class Main {
	public static void main(String[] args) {
		Son son = new Son();
		son.sleep();
		son.dancing();
	}
}
