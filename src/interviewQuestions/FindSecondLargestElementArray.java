package interviewQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindSecondLargestElementArray {

	public static void main(String[] args) {
		int arr[] = { 1, 20, 30, 54, 76, 11, 88, 43, 87, 05, 34, 2, 90 };
		Arrays.sort(arr);
		System.out.println("Length is: " + arr.length);
		/*
		 * index starts with 0 If we have to give the nth largest element nth element =
		 * n-1
		 */
		int nthLargest = 2;
		int index = arr.length + 1 - nthLargest;
		findSecondLargest(arr, index);
		sumOfAllElementsInArray(arr);

	}

	// Find nth largest element from the array
	public static void findSecondLargest(int arr[], int n) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				temp = arr[i];  // 1
				arr[i] = arr[j];  // 2 
				arr[j] = temp;  // 1
			}
		}
		System.out.println(arr[arr.length - n]);
	}

	// Find sum and count of all the elements in an array
	public static void sumOfAllElementsInArray(int[] array) {
		int sum = 0;
		int count = 0;
		for (int i : array) {
			sum = sum + i;
			count = count + 1;
		}
		System.out.println("Total sum is: " + sum);
		System.out.println("Total count is: " + count);
	}
	


}
