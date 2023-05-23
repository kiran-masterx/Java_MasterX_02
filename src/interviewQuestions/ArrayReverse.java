package interviewQuestions;

public class ArrayReverse {

	public static void main(String[] args) {
		Object[] arr = { "Test", 'a', 100, 10.1, true, "Selenium", 150, 189 };
		int length = arr.length;
		for (int i = length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

}
