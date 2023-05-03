package strategy.clase;

public class PlataCard implements ModPlata{

	@Override
	public void plateste(String numeClient, double sumaPlata) {
		System.out.println("Clientul " + numeClient + " are de platit cu cardul " + sumaPlata + " lei.");
		
	}
	

}