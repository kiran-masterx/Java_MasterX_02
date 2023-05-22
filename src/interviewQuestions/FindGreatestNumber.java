package interviewQuestions;

public class FindGreatestNumber {

	public static void main(String[] args) {
		findGreatestNumber(10,20,30);
		findGreatestNumber(55,45,10);
		findGreatestNumber(55,100,10);
		findGreatestNumber(55,100,100);
	}

	public static void findGreatestNumber(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("a is the greatest: " + a);
		} else if (b > c) {
			System.out.println("b is the greatest: " + b);
		} else {
			System.out.println("c is the greatest: " + c);
		}
	}

}
