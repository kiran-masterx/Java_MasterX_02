package interviewQuestions;

public class StarPattern {

	public static void main(String[] args) {
//		*             --> rows = i, columns = j
//		**
//		***
//		****
//		*****
		for (int i = 0; i <= 4; i++) {     //0,1,2
			for(int j = 0; j<=i; j++) {   //0,
				System.out.print("*");    
			}
			System.out.println();
		}
//		
//		System.out.println();
//		*****
//		****
//		***
//		**
//		*
		for (int i =0; i<=4; i++) {
			for(int j =4; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		    *
//		   **
//		  ***
//		 ****
//		*****
		System.out.println();
		for (int i =0; i<=5; i++) {
			for (int j = 4; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
