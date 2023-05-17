package basic;

public class JavaFunctions2 {

	public static void main(String[] args) {
		sum();
		sum1();
		System.out.println(1+ sum1());
//		System.out.println(sum());
//		System.out.println(sum() + 2);
//		System.out.println(multiply());
//		System.out.println(s1());
	}
	
	public static void sum() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Executing sum method");
		System.out.println(c);
	}
	public static int sum1() {
		int a = 101;
		int b = 20;
		int c = a + b;
		System.out.println("Executing sum1 method");
		return c;
	}
	
	public static int multiply() {
		int a = 10; 
		int b = 5;
		int c = a * b;
		return c;
	}
	
	public static String s1() {
		String a = "Helllo ";
		String b = "Hi";
		return a + b;
	}

	
}
