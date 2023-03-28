package builder;

public class PacientBuilder implements Builder {
	
	private Pacient pacient;
	
	public PacientBuilder(String nume) {
		this.pacient = new Pacient();
		this.pacient.setNume(nume);
	}
	
	public Pacient build() {
		return this.pacient;
	}
	
	/*
	 * public PacientBuilder setNume(String nume) { this.pacient.setNume(nume);
	 * return this; }
	 */
	
	
	public PacientBuilder setPatRabatabil(Boolean parRabatabil) {
		this.pacient.setPatRabatabil(parRabatabil);
		return this;
	}
	
	public PacientBuilder setMicDejunInclus(Boolean micDejunInclus) {
		this.pacient.setMicDejunInclus(micDejunInclus);
		return this;
	}


}
