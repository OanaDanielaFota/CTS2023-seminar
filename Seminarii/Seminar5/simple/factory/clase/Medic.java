package simple.factory.clase;

public class Medic implements PersonalSpital{
	private String nume;

	public Medic(String nume) {
		super();
		this.nume = nume;
	}
	
	public String toString() {
		return "Medic [nume=" + nume + "]";
	}
	
	@Override
	public void descrie() {
		System.out.println("Medicul " + this.nume);
		
	}
}
