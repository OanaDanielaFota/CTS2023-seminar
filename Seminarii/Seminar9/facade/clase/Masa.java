package facade.clase;

public class Masa {
	private Boolean masaLibera;
	private int nrMasa;
	private Boolean areServetele;
	
	
	
	public Boolean getAreServetele() {
		return areServetele;
	}

	public void setAreServetele(Boolean areServetele) {
		this.areServetele = areServetele;
	}

	public Masa(Boolean masaLibera, int nrMasa, Boolean areServetele) {
		super();
		this.masaLibera = masaLibera;
		this.nrMasa = nrMasa;
		this.areServetele = areServetele;
	}

	public Boolean getMasaLibera() {
		return masaLibera;
	}

	public void setMasaLibera(Boolean masaLibera) {
		this.masaLibera = masaLibera;
	}

	public int getNrMasa() {
		return nrMasa;
	}

	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}

	@Override
	public String toString() {
		return "Masa [masaLibera=" + masaLibera + ", nrMasa=" + nrMasa + " are servetele: " + areServetele +  "]";
	}
	
	
	

}