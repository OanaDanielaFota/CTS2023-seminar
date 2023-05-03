package simple.factory.clase;

public class Brancardier implements PersonalSpital{
	private String nume;

	public Brancardier(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public String toString() {
		return "Brancardier [nume=" + nume + "]";
	}

	@Override
	public void descrie() {
		System.out.println("Brancardierul " + this.nume);
	}
}
