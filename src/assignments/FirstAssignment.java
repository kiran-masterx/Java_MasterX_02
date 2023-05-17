package assignments;

public class FirstAssignment {

	public static void main(String[] args) {
//		# Java Assignment 1
//
//		1. Write a program to print all the even numbers from 0 to 50.
//
//		2. Write a program to print all the odd numbers from 0 to 100 that are divisible by 9. 
//
//		3. Write a program to print all the numbers from 0 to 50, excluding the numbers divisible by 5. 
//
//		4. Create a dynamic method that divides the students based on their grades in the exam. And give meaningful messages for the same in console. 
//
//		5. Create an array with the names of students, and if name is Ram, then print that particular index of name on the console. 

//		for (int i = 0; i <= 50; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			} else {
//				System.out.println("This is odd number");
//			}
//		}

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				if(i % 9 == 0) {
					if (i < 80) {
						System.out.println(i);
					}
					
				}
			}
		}

//		for(int i = 0; i<=50; i++) {
//			if(i % 5 != 0) {
//				System.out.println(i);
//			}
//		}
//		divideStudentsOnGrade('B');
//		divideStudentsOnGrade('A');
//		divideStudentsOnGrade('M');
//		divideStudentsOnGrade('1');

		String[] names = { "Sunil", "Pradeep", "Varsha", "Gunu", "Tejaswini", "Ram", "Shubham" };
		int index = 0;
		String k;
		for (String s : names) {
			index ++;
			System.out.println(index);
			if (s == "Ram") {
				int ramIndex = index-1;
				System.out.println("The index of Ram is " + ramIndex);
				break;
			}
		}
	}

	public static void divideStudentsOnGrade(char grade) {
		if (grade == 'A') {
			System.out.println("Passed with distinction");
		} else if (grade == 'B') {
			System.out.println("passed with first class");
		} else if (grade == 'C') {
			System.out.println("passed with second class");
		} else {
			System.out.println("failed");
		}
	}

}
