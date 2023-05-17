package basic;

public class ThrowAndThrowsKeyword {

	public static void main(String[] args) {
		int a = 10;
		m1();
		throw new NullPointerException();
	}
	
	public static void m1() throws NullPointerException, NullPointerException {
		int a = 20; 
		int b = a/0;
		
	}

}
