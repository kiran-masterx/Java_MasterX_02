package basic;

public class ConditionalStatements {

	public static void main(String[] args) {
		int age = 10;
		if (age > 18) {
			System.out.println("The person is adult.");
		} else {
			System.out.println("The person is minor.");
		}
		System.out.println("Out of if-else");

		// if else ladder : Multiple conditions can be checked against a variable.

		// marks < 35 =Fail
		// If marks is in between 35 to 65 = Passed with second class
		// If marks is in between 65 to 85 = Passed with first class
		// If marks is greater than 85 = Passed with distinction
		
		
		System.out.println(checkResult(45) + checkResult(90));
		System.out.println(checkResult(90));
//		checkResult(10);
//		checkResult(60);
//		checkResult(24);
//		switchCaseConcept();
//		switchCaseConceptString("Sunday");
//		switchCaseConceptString("Monday");
	}

	public static int checkResult(int marks) {
		if (marks < 35) {
			System.out.println("Failed.");
		} else if (marks >= 35 && marks < 65 || marks == 24) {
			System.out.println("Passed with second class.");
		} else if (marks >= 65 && marks < 85) {
			System.out.println("Passed with first class");
		} else {
			System.out.println("Passed with distinction.");
		}
		return marks; 
	}
	
	public static void switchCaseConcept() {
		int day = 4; 
		switch (day) {
		case 1:
			System.out.println("Executing case 1");
			break;
		case 2:
			System.out.println("Executing case 2");
			break;
		case 3:
			System.out.println("Executing case 3");
			break;
		default: 
			System.out.println("day dosent exist");
		}
	}
	
	public static void switchCaseConceptString(String day) {
		switch (day) {
		case "Monday":
			System.out.println("Executing case 1");
			break;
		case "Tuesday":
			System.out.println("Executing case 2");
			break;
		case "Sunday":
			System.out.println("Executing case 3");
			break;
		default: 
			System.out.println("day dosent exist");
		}
	}

}
