package template.clase;

public abstract class MasaRestaurant {
	
	private int numarMasa;

	public MasaRestaurant(int numarMasa) {
		this.numarMasa = numarMasa;
	}
	
	
	public int getNumarMasa() {
		return numarMasa;
	}

	protected abstract void curataMasa();
	protected abstract void aseazaServetele();
	protected abstract void aseazaTacamuri();
	protected abstract void invitaPersoane();
	
	public final void ocupaMasa() {
		curataMasa();
		aseazaServetele();
		aseazaTacamuri();
		invitaPersoane();
		
	}
	

}
