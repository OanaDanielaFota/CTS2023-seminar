package simple.factory.clase;

public class Asistent implements PersonalSpital{
	private String nume;

	public Asistent(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public String toString() {
		return "Asistent [nume=" + nume + "]";
	}

	@Override
	public void descrie() {
		System.out.println("Asistentul " + this.nume);
	}
}

