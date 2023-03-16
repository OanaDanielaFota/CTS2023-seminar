package cts.singleton;

public class Rector {
	private String nume;
	private int nrMandate;
	private int varsta;
	
	
	private static Rector instanta = null;


	public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public int getNrMandate() {
		return nrMandate;
	}


	public void setNrMandate(int nrMandate) {
		this.nrMandate = nrMandate;
	}


	public int getVarsta() {
		return varsta;
	}


	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}


	public static Rector getInstanta() {
		return instanta;
	}


	public static void setInstanta(Rector instanta) {
		Rector.instanta = instanta;
	}


	public Rector(String nume, int nrMandate, int varsta) {
		super();
		this.nume = nume;
		this.nrMandate = nrMandate;
		this.varsta = varsta;
	}


	public static synchronized Rector getInstanta(String nume, int nrMandate, int varsta) {
		if(instanta == null) {
			instanta = new Rector(nume, nrMandate, varsta);
		}
		return instanta;
	}
	
	
	

}
