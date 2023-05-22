package interviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Selenium";
		//          01234567
		
		//Get the length of the string
		int length = s.length();
		System.out.println(length);
		
		//Declare an empty variable to store the reversed string
		String rev = "";
		
		for(int i = length-1; i>=0; i--) {
			rev = rev + s.charAt(i);
			System.out.println(rev);
		}
		System.out.println(rev);
	}

}
