package decorator.clase;

public abstract  class Decorator implements INotaDePlata{
	private INotaDePlata notaDePlata;

	public Decorator(INotaDePlata notaDePlata) {
		super();
		this.notaDePlata = notaDePlata;
	}
	
	@Override
	public void printeazaNotaDePlata(int totalPlata) {
		this.notaDePlata.printeazaNotaDePlata(totalPlata);
		
	}
	
	public abstract void printeazaFelicitare();
	
	

}