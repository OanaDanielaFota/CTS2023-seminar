package template.clase;

public class MasaRezervata extends MasaRestaurant{
	
	private String oraRezervare;
	
	
	public MasaRezervata(int numarMasa, String oraRezervare) {
		super(numarMasa);
		this.oraRezervare = oraRezervare;
	}
	
	protected void curataMasa() {
		System.out.println("Curata masa " + super.getNumarMasa() +  " pentru ca persoanele care au rezervat la ora " + this.oraRezervare);
	}
	protected void aseazaServetele() {
		
		System.out.println("Aseaza servetele pe masa " + getNumarMasa() + " pentru ca persoanele care au rezervat la ora " + this.oraRezervare);

	}
	
	protected void aseazaTacamuri() {
		
		System.out.println("Aseaza tacamuri pe masa " + getNumarMasa() + " pentru ca persoanele care au rezervat la ora " + this.oraRezervare);

	} 
	
	protected void invitaPersoane() {
		
		System.out.println("Invita persoanele la masa " + getNumarMasa() + " pentru rezervarea de la ora " + this.oraRezervare);

	}
}
