package basic;

public class JavaFunctions {

	public static void main(String[] args) {
		sum();
		division();
		multiply();
		sum();
		sum();
	}
	
	public static void sum() {
		int a = 10;
		int b = 20;
		int c = a + b; 
		System.out.println("Result of sum of two integers is: " +c);
		division();
	}
	
	public static void division() {
		int a = 10;
		int b = 20;
		int c = b / a; 
		System.out.println(c);
		sum();
	}
	
	public static void multiply() {
		int a = 10;
		int b = 20;
		int c = b * a; 
		System.out.println(c);
	}
}
