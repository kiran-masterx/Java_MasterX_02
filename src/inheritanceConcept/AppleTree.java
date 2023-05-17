package inheritanceConcept;

public class AppleTree extends Tree {

	public static void main(String[] args) {
		AppleTree a = new AppleTree();
		a.branches();
		a.leaves();
//		a.apples();
		a.apples(10);
		System.out.println(a.apples1(120));;
		int b = 20;
		apples(b);
		AppleTree.apples(0);
	}

//	public void apples() {
//		System.out.println("AppleTree-apples");
//	}
	
	public static void apples(int i) {
	}

	public int apples1(int i) {
		i = i + 100;
		return i;
	}
	
	
}
