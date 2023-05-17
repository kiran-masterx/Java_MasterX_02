package encapsulation;

public class ClassB {

	public static void main(String[] args) {
		ClassA a = new ClassA();
		//Setting the variable values
		a.setUserName("Test@123");
		a.setPassWord(12345);
		
		//Getting the variable values.
		System.out.println(a.getUserName());
		System.out.println(a.getPassWord());

	}
}
