package decorator.clase;

public class DecoratorNotaDePlataLaMultiAni extends Decorator{

	public DecoratorNotaDePlataLaMultiAni(INotaDePlata notaDePlata) {
		super(notaDePlata);
	}
	
	

	@Override
	public void printeazaNotaDePlata(int totalPlata) {
		super.printeazaNotaDePlata(totalPlata);
		System.out.println("La multi ani!");
	}



	@Override
	public void printeazaFelicitare() {
		System.out.println("La multi ani!");
		
	}

}