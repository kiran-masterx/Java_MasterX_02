package basic;

public class JavaVariables {
	int a = 10;
	String s = "Hi";
	
	static String username = "Test1";
	
	static int p = 20; 
	static String q = "Welcome";

	public static void main(String[] args) {
		//Local Variable
		String s = "Java";
		System.out.println(s);
		//Global Variable
		JavaVariables j = new JavaVariables();
		System.out.println(j.a);
		System.out.println(j.s);
		
		//Static Variables
		System.out.println(p);
		System.out.println(username);
		System.out.println(JavaVariables.p);
		System.out.println(JavaVariables.q);
		
		m1();
		j.m2();
		
	}

	public static void m1() {
		int a = 10;
		System.out.println(username);
		System.out.println(a);
		JavaVariables obj = new JavaVariables();
		System.out.println(obj.s);
		System.out.println(p);
		System.out.println(q);
	}

	public void m2() {
		int b = 210;
		System.out.println(username);
		System.out.println(b);
		System.out.println(s);
		JavaVariables obj = new JavaVariables();
		System.out.println(obj.s);
		System.out.println(p);
		System.out.println(q);
	}

}
