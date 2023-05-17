package basic;

public class JavaFunctions3 {

	public static void main(String[] args) {
		sum();
		sum(10, 20);
		sum(20, 30, 50);
		sum(100, 200);
		sum(5567, 9873);
		
		division(10, 20);
		division(20, 30);
		division(100, 200);
		division(5567, 9873);
	}
	public static void sum() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
	
	public static void sum(int b, int a) {
		int c = a + b;
		System.out.println(c);
	}
	
	public static void sum(int b, int a, int d) {
		int c = a + b - d; //20+30-50
		System.out.println(c);
	}

	public static void division(int a, int b) {
		int c = b / a;
		System.out.println(c);
	}

}
