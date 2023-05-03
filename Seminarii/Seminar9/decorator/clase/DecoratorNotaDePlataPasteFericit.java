package decorator.clase;

public class DecoratorNotaDePlataPasteFericit extends Decorator{

	public DecoratorNotaDePlataPasteFericit(INotaDePlata notaDePlata) {
		super(notaDePlata);
	}
	
	

	@Override
	public void printeazaNotaDePlata(int totalPlata) {
		super.printeazaNotaDePlata(totalPlata);
		System.out.println("Paste fericit!");
	}



	@Override
	public void printeazaFelicitare() {
		System.out.println("Paste fericit!");
		
	}
	
	

}