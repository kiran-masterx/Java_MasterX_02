package inheritanceConcept;

public class MangoTree extends Tree {
	public static void main(String[] args) {
		
		MangoTree m = new MangoTree();
		
		m.branches();
		m.leaves();
		m.mangos();
		System.out.println();
		System.out.println("With Parent class object");
		
		Tree t = new Tree();
		
		t.branches();
		t.leaves();
		//t.mangos();
		
		System.out.println();
		System.out.println("Top Casting");
		
		Tree t1 = new MangoTree();
		
		t1.branches();
		t1.leaves();
//		t1.mangos();
		//Parent class methods and common methods. 
		System.out.println();
		System.out.println("Down Casting");
		
//		MangoTree m1 = new Tree();
	}
	
	public void mangos() {
		System.out.println("MangoTree-mangos");
	}
	public void leaves() {
		System.out.println("MangoTree-leaves");
		System.out.println("Special features");
	}

}
