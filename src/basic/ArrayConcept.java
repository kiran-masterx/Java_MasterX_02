package basic;

public class ArrayConcept {

	public static void main(String[] args) {
		int[] marks = new int[5];
		int marks1[] = new int[6];
		// [50,70,70,80,90] => size of array is 5.
		// [0 , 1, 2, 3, 4]
		// lower bound index = 0
		// Upper bound index = size of array - 1 = 5-1 = 4
		// Storing an elements in an array
		marks[0] = 50;
		marks[3] = 80;
		marks[1] = 70;
		marks[2] = 70;
		marks[4] = 90;
		System.out.println(marks.length);
		System.out.println(marks[3]); // It means 3rd index element
		System.out.println(marks[4]);
//		System.out.println(marks[5]);

		int age[] = { 10, 20, 40, 60, 67, 80 };
		System.out.println(age.length);
		System.out.println(age[3]);

		String[] arr = { "Test", "test@123", "test@11", "test@1122" };
		System.out.println(arr.length);
		System.out.println(arr[1]);

		// For Loop
		// Forward direction
		// marks = [50,70,70,80,90]
		// length = 5,
		// LBI = 0
		// UBI = 4
		System.out.println("Forword for loop");
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		// Reverse for loop
		System.out.println("Reverse for loop");
		for (int i = marks.length - 1; i >= 0; i--) {
			System.out.println(marks[i]);
		}

		// Partial for loop
		System.out.println("Partial for loop");
		for (int i = 2; i < marks.length - 2; i++) {
			System.out.println(marks[i]);
		}

		// Enhanced for loop
		System.out.println("Enhanced for loop");
		for (int i : age) {
			System.out.println(i);
		}
		int marks2[] = new int[6];
		int arr1 [] [] = new int [2] [3];
		
	}

}
