package basic;

public class ConstructorConcept {
	
	String name; 
	int age; 
	
	public static void main(String[] args) {
		ConstructorConcept c1 = new ConstructorConcept();
		ConstructorConcept c2 = new ConstructorConcept("Ram", 10);
		System.out.println(c2.name);
		System.out.println(c2.age);
	}
	
	public ConstructorConcept(){
		System.out.println("Default constructor");
	}
	
	public ConstructorConcept(String a, int b) {
		name = a;
		age = b;
		System.out.println(a);
	}

}
