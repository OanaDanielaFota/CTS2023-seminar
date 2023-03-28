package builder;

public class Pacient {
	
	private String nume;
	private Boolean patRabatabil;
	private Boolean micDejunInclus;
	private Boolean papuciDeCamera;
	
	

	public Pacient(String nume, Boolean patRabatabil, Boolean micDejunInclus, Boolean papuciDeCamera) {
		super();
		this.nume = nume;
		this.patRabatabil = patRabatabil;
		this.micDejunInclus = micDejunInclus;
		this.papuciDeCamera = papuciDeCamera;
	}

	
	public Pacient() {
		this.nume = "Anonim";
		this.patRabatabil = false;
		this.micDejunInclus = false;
		this.papuciDeCamera = false;
	}

	public String getNume() {
		return nume;
	}


	protected void setNume(String nume) {
		this.nume = nume;
	}


	public Boolean getPatRabatabil() {
		return patRabatabil;
	}


	protected void setPatRabatabil(Boolean patRabatabil) {
		this.patRabatabil = patRabatabil;
	}


	public Boolean getMicDejunInclus() {
		return micDejunInclus;
	}


	protected void setMicDejunInclus(Boolean micDejunInclus) {
		this.micDejunInclus = micDejunInclus;
	}


	public Boolean getPapuciDeCamera() {
		return papuciDeCamera;
	}


	protected void setPapuciDeCamera(Boolean papuciDeCamera) {
		this.papuciDeCamera = papuciDeCamera;
	}


	@Override
	public String toString() {
		return "Pacient [nume=" + nume + ", patRabatabil=" + patRabatabil + ", micDejunInclus=" + micDejunInclus
				+ ", papuciDeCamera=" + papuciDeCamera + "]";
	}
	
	
	
	
	

}
