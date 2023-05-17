package AbstractionConcept;

public class Mahindra extends Colour {

	public static void main(String[] args) {
		Mahindra m = new Mahindra();
		m.black();
		m.darkEdition();
		m.dualTone();
		m.purple();
		m.electric();
	}

	public void black() {
		System.out.println("colour-black");
	}

	public void dualTone() {
		System.out.println("colour-dualTone");
	}
	
	public void electric() {
		System.err.println("Mahindra-electric");
	}
	
	public void purple() {
		System.err.println("Mahindra-purple");
	}

	public void darkEdition() {
		System.out.println("Mahindra-darkEdition");
	}

}
