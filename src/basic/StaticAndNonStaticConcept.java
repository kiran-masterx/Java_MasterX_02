package basic;

public class StaticAndNonStaticConcept {
	static StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();

	public static void main(String[] args) {
		m1();
		StaticAndNonStaticConcept.m1();
		obj.m3();
		obj.m2();
	}

	public static void m1() {
		System.out.println("inside m1");
		obj.m3();
		obj.m2();
	}

	public void m2() {
		System.out.println("inside m2");
	}

	public void m3() {
		System.out.println("inside m3");
	}
	
	

}
