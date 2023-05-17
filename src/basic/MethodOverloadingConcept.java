package basic;

public class MethodOverloadingConcept {
	
	static int k = 10; 
	public static void main(String[] args) {
		MethodOverloadingConcept obj = new MethodOverloadingConcept();
		obj.m1();
		obj.m1(10);
		obj.m1(20,30);
		obj.m1(40,50,60);
		obj.m1("Test");
		obj.m1(70, "Test@123");
		obj.m1("Test@123", 80);
		obj.m1(0, null);
		obj.m1(0, 0, 0);
		obj.m1("Test");
		System.out.println(k);
	}

	public void m1() {
		System.out.println("Inside m1 with no params");
		System.out.println(k);
	}

	public int m1(int a) {
		System.out.println(a);
		System.out.println(k);
		return a;
	}

	public void m1(int a, int b) {
		System.out.println(a + "," + b);
		System.out.println(k);
	}

	public void m1(int a, int b, int c) {
		System.out.println(a + "," + b + "," + c);
	}
	
	public void m1(String s) {
		System.out.println(s);
	}
	
	public void m1(int a, String s) {
		System.out.println(a + "," + s);
	}
	
	public void m1(String s, int a) {
		System.out.println(s + "," + a);
	}

}
