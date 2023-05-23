package interviewQuestions;

public class FibonacciSeries {

	public static void main(String[] args) {
		/*
		 * Each no. is sum of two preceding number. 
		 * It always starts from 0, 1. 
		 * 0,1,1,2,3,5,8,13......
		 */
		fibonacciSeries(5);

	}
	
	public static void fibonacciSeries (int num) {
		int firstTerm = 0;
		int secondTerm = 1;
	
		for(int i = 1; i <=num; i++) {
			System.out.print(firstTerm + ","); //0,1,1
			int nextTerm = firstTerm + secondTerm; //1,2
			firstTerm = secondTerm;  //1,1
			secondTerm = nextTerm;   //1,2
		}
	}

}
