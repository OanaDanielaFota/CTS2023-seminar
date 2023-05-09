package template.clase;

public class MasaLocala extends MasaRestaurant {
	
	public MasaLocala(int numarMasa) {
		super(numarMasa);
	}

	public void curataMasa() {
		
		System.out.println("Chelnerul curata masa " + getNumarMasa() +  " pentru ca persoanele asteapta invitatia la masa.");
	}
	
	public  void aseazaServetele() {
		
		System.out.println("Chelnerul aseaza servetele pentru masa " + getNumarMasa() + " pentru ca persoanele asteapta invitatia la masa.");

	}
	public  void aseazaTacamuri() {
		
		System.out.println("Chelnerul aseaza tacamurile pentru masa " + getNumarMasa() + " pentru ca persoanele asteapta invitatia la masa.");

	}
	public  void invitaPersoane() {
		
		System.out.println("Chelnerul invita persoanele la masa " + getNumarMasa());

	}
}
