package interviewQuestions;

public class FactorialNumber {

	public static void main(String[] args) {

		/*
		 * Factorial number is the product of that number with every whole number less
		 * than this number upto 1. 5! == 5*4*3*2*1 = 120 3! == 3*2*1 = 6
			 * 1*1 = 1
			 * 1*2 = 2
			 * 2*3 = 6
			 * 6*4 = 24
			 * 24*5 = 120
			 */
		System.out.println(factorialOfNumber(5));
		System.out.println(factorialOfNumber(15));
	}

	public static int factorialOfNumber(int num) {
		int factorial = 1;
		int n = num;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

}
