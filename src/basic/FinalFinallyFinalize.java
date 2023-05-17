package basic;

public class FinalFinallyFinalize {

	public static void main(String[] args) {
		int i = 10; 
		System.out.println(i);
		i = 20; 
		System.out.println(i);
		
		// With final keyword
		final int j = 10; 
		System.out.println(j);
//		j = 30; 
		
		//Finally block: 
		try {
			System.out.println("Inside try");
			int k = 20/10;
			System.out.println(k);
		}catch (Exception e) {
			System.out.println("Inside catch");
		}finally {
			System.out.println("Inside finally");
		}
		int k= 20;
		
		System.out.println();
		try {
			 k = 20/0;
			System.out.println("Inside try");
			System.out.println(k);
		}catch (Exception e) {
			System.out.println(e);
			System.out.println("Inside catch");
		}finally {
			System.out.println("Inside finally");
			System.out.println(k);
		}
	
		

	}

}
