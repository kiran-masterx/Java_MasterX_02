package AbstractionConcept;

public class Tesla implements Saftey {

	public void sixAirBags() {
		System.out.println("Tesla-sixAirBags");
	}
	
	public void electric() {
		System.out.println("Tesla-electric");
	}
	
	public void fiveStarRating() {
		System.out.println("Tesla-fiveStarRating");
	}
	
	public static void main(String[] args) {
		Tesla t = new Tesla();
		t.sixAirBags();
		t.fiveStarRating();
		t.electric();
		
//		Saftey s = new Saftey();
	}

}
