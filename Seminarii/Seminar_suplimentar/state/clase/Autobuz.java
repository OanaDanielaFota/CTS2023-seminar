package state.clase;

public class Autobuz {

	private IBusState stare;
	private String placutaDeInmatriculare;
	
	public Autobuz(String placutaDeInmatriculare) {
		this.placutaDeInmatriculare = placutaDeInmatriculare;
		this.stare = new AutobuzLaCapatDeLinie();
	}

	public IBusState getStare() {
		return stare;
	}

	protected void setStare(IBusState stare) {
		this.stare = stare;
	}

	public String getPlacutaDeInmatriculare() {
		return placutaDeInmatriculare;
	}
	
	public void pleacaInCursa() {
		IBusState ruta = new AutobuzInCursa();
		ruta.schimbaStare(this);
	}

	public void inService() {
		IBusState service = new AutobuzInService();
		service.schimbaStare(this);
	}
	
	public void laCapatDeLinie() {
		IBusState capat = new AutobuzLaCapatDeLinie();
		capat.schimbaStare(this);
	}
	
}
