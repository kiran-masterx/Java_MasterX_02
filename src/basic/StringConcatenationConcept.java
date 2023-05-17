package basic;

public class StringConcatenationConcept {
	
	public static void main(String[] args) {
		// 1. Concatenation Operator (+):

		String a = "Automation@123 ";
		String b = "Testing";
		String d = "Java";

		String c = a + b + " with " + d;
		System.out.println("Concatenation with + Operator :- " + c);
		String c1 = a + b + " with " + d;
		System.out.println("Concatenation with + Operator :- " + c1);
		String c2 = a + b + " with " + d;
		System.out.println("Concatenation with + Operator :- " + c2);
		
		//2. concat() method: 
		String e1 = b + a;
		System.out.println(e1);
		String e = b.concat(a);
		System.out.println("With conact() method:- " + e.concat(d));
		//In e we are storing the new concatenated string
		//a is first string which is joining with b
		
		int p = 100; 
		int q = 200; 
		System.out.println(p + q);
		System.out.println(b + p + q);//Testing --> Testing100 --> Testing100200
		System.out.println(p + q + b + 300);//100 --> 300 --> 300Testing
		

	}

}
