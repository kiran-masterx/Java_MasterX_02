package interviewQuestions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		/*
		 * The sum of cubes of each digits is equal to the number itself. 
		 * 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
		 */
		System.out.println(isArmstrongNumber(153));
		System.out.println(isArmstrongNumber(155));
		System.out.println(isArmstrongNumber(393));

	}

	public static boolean isArmstrongNumber(int num) {
		int reminder;
		int cube = 0;
		int temp;
		temp = num;

		while (num > 0) {
			reminder = num % 10;                          //153 % 10 = 3  , 15.3 % 10 = 5.3 == 5, 1.53%10 = 1.53  == 1
			num = num / 10;                               //153 / 10 = 15.3, 15.3/10 = 1.53, 1.53/10 = 0.153
			cube = cube + reminder * reminder * reminder; // 0 + 3*3*3 = 27, 27 + 5*5*5 = 27+125 = 152 ,152  + 1*1*1 = 153
		}
		
		if(temp == cube) {
			return true;
		}else {
			return false;
		}

	}

}
