package basic;

public class WrapperClass {

	public static void main(String[] args) {
		//Int to string -> primitive to non primitive
		//1. valueOf();
		int a = 100; 
		String s = String.valueOf(a);
		System.out.println(s);
		
		//Converts from non-primitive to primitive
		//String to int
		//2. xxxValue();
		Integer i = 20; 
		int j = i.intValue();
		System.out.println(j);

		//Converts from non-primitive to primitive
		String s1 = "100";
		int b = Integer.valueOf(s1);
		System.out.println(b);
		System.out.println(b + 10);
		
		//parse() method
		// string to primitive
		// Converts from non-primitive to primitive
		String a1 = "1005463";
		int b1 = Integer.parseInt(a1);
		
		String a2 = "true";
		String a3 = "100.120";
		
		boolean b2 = Boolean.parseBoolean(a2);
		double b3 = Double.parseDouble(a3);
		
		System.out.println(a1+ " " + a2 + " " + a3);
		System.out.println(b1+ " " + b2 + " " + b3);
	}

}
