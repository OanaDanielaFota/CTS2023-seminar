package state.clase;

public class AutobuzLaCapatDeLinie implements IBusState {
	
	public void schimbaStare(Autobuz autobuz) {
		
		if(autobuz.getStare() instanceof AutobuzInCursa || autobuz.getStare() instanceof AutobuzInService) {
			System.out.println("Autobuzul " + autobuz.getPlacutaDeInmatriculare() + " a ajuns la capat de linie.");
			autobuz.setStare(this);
		} else {
			System.out.println("Autobuzul " + autobuz.getPlacutaDeInmatriculare() + " nu a ajuns la capat de linie.");
	
		}
	}

	
}
