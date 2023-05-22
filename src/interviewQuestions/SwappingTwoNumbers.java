package interviewQuestions;

public class SwappingTwoNumbers {

	public static void main(String[] args) {

		// With third variable
		int a = 10;
		int b = 20;
		System.out.println("the value of a is " + a);
		System.out.println("the value of b is " + b);
		int c = a; // 10
		a = b; // 20
		b = c; // 10

		System.out.println("the value of a is " + a);
		System.out.println("the value of b is " + b);

		// Without third variable
		int p = 15;
		int q = 25;
		q = p + q; // 15 + 25 = 40
		p = q - p; // 40 - 15 = 25
		q = q - p; // 40 - 25 = 15
		
		System.out.println("the value of p is " + p);
		System.out.println("the value of q is " + q);

	}

}
