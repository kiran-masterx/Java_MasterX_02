package basic;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 0;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("reverse while loop");
		int j = 10;
		while(j>=0) {
			System.out.println(j);
			j--;
		}
		
		System.out.println("do-while loop");
		//do-while loop: 
		int k = 5; 
		do {
			System.out.println(k);
			k++;
		}while(k>10);
		System.out.println("Out of do while loop");
	}

}
