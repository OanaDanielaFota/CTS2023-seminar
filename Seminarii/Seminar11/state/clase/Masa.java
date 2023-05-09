package state.clase;

public class Masa {
	private int nrRezervare;
	private Stare stare;
	public Masa(int nrRezervare) {
		super();
		this.nrRezervare = nrRezervare;
		this.stare = new StareLibera();
	}
	public int getNrRezervare() {
		return nrRezervare;
	}
	public void setNrRezervare(int nrRezervare) {
		this.nrRezervare = nrRezervare;
	}
	public Stare getStare() {
		return stare;
	}
	protected void setStare(Stare stare) {
		this.stare = stare;
	}
	
	public void rezervaMasa() {
		Stare stare = new StareRezervata();
		stare.schimbareStare(this);
	}
	
	public void ocupaMasa() {
		Stare stare = new StareOcupata();
		stare.schimbareStare(this);
	}
	
	public void elibereazaMasa() {
		Stare stare = new StareLibera();
		stare.schimbareStare(this);
	}
	
	public void ridicaRezervare() {
		Stare stare = new StareOcupata();
		stare.schimbareStare(this);
	}
	
	public void anuleazaRezervare() {
		Stare stare = new StareLibera();
		stare.schimbareStare(this);
	}
}