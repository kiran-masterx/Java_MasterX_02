package basic;

public class DoubtClearingSession2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		for (int i = 5; i <= 8; i++) {
			System.out.println(i);
		}
		System.out.println();
		for (int i = 8; i >= 5; i--) {
			System.out.println(i);
		}
		int[] array = { 1, 2, 3, 4, 5 };

		for (int i : array) {
			System.out.println(i);
		}
		System.out.println();
		for (int i = 6; i > array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
