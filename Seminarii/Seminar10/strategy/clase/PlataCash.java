package strategy.clase;

public class PlataCash implements ModPlata{
	

	@Override
	public void plateste(String numeClient, double sumaPlata) {
		System.out.println("Clientul " + numeClient + " are de platit cash " + sumaPlata + " lei.");
		
	}

}