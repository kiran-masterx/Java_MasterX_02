package basic;

public class Exceptions {

	public static void main(String[] args) {
		int c = 10/0; 
		System.out.println(c);	
		String s = null;
		s.charAt(10);
		Object o = new Object();
		String s2 = (String)o;
		try {
			String s3 = null;
			
			try {
				int a1 = 10/0;
			}catch (ArithmeticException e) {
				System.out.println(e);
			}
			s.charAt(10);
		} catch (NullPointerException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}

		System.out.println("Executing after catching the exception");
	}

}
