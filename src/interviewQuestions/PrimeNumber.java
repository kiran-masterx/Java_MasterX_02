package interviewQuestions;

public class PrimeNumber {
	public static void main(String[] args) {
		/*
		 * The prime number is  a number which is divisible by 1 and itself. 
		 * The lowest prime number 2. 
		 * 10%2 == 0, 9%2 == 1, 99%2 = 1
		 */
		
		System.out.println(isPrimeNumber(10));
		System.out.println(isPrimeNumber(11));
		System.out.println(isPrimeNumber(1));
		System.out.println(isPrimeNumber(97));
		findPrimeNumbers(20);
		findPrimeNumbers(50);
	}

	public static boolean isPrimeNumber(int num) {
		if(num <=1) {
			return false;
		}
		for(int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	//Print prime number upto 20, 50, etc.......
	
	public static void findPrimeNumbers (int a) {
		int count = 0; 
		for(int i = 0; i <= a ; i++) {
			if (isPrimeNumber(i)== true) {
				System.out.println(i);
				count = count + 1;
			}
		}
		System.out.println("the count of primes upto " + a + " is " + count);
	}

}
