package basic;

public class ForLoop {

	public static void main(String[] args) {
		// Forward for loop
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}
		
		// Forward for loop
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		
		// Forward for loop
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		
		// Reverse for loop
		System.out.println("Reverse for loop");
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		
		// Reverse for loop
		System.out.println("Reverse for loop");
		for (int i = 30; i >= 0; i--) {
			System.out.println(i);
		}

		// Partial for loop:
		System.out.println("Partial for loop");
		for (int i = 2; i <= 5; i++) {
			System.out.println(i);
		}
		//i++, i = i+1, i+=1, i+=2
		// i = i+2
		// Incremented by other than 1
		System.out.println("incremented by 4");
		for (int i = 0; i <= 10; i+=4) {
			System.out.println(i);
		}
		
//		List crm = driver.findElements(By.xpath("your xpath")).getText();
//
//		for(int i = 0; i<=crm.length; i++){
//		      if(crm[i] == "Real Estate CRM"){
//		         driver.findElement(crm[i]).click();
//		      }
//		}
	}

}
