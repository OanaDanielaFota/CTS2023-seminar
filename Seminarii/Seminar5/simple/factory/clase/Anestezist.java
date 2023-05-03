package simple.factory.clase;

public class Anestezist implements PersonalSpital{
	private String nume;

	public Anestezist(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public String toString() {
		return "Anestezist [nume=" + nume + "]";
	}

	@Override
	public void descrie() {
		System.out.println("Anestezistul " + this.nume);
	}
}
