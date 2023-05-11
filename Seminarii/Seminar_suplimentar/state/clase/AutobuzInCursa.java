package state.clase;

public class AutobuzInCursa implements IBusState {

public void schimbaStare(Autobuz autobuz) {
		
		if(autobuz.getStare() instanceof AutobuzLaCapatDeLinie) {
			System.out.println("Autobuzul " + autobuz.getPlacutaDeInmatriculare() + " a plecat pe o noua ruta.");
			autobuz.setStare(this);
		} else {
			System.out.println("Autobuzul " + autobuz.getPlacutaDeInmatriculare() + " nu poate pleca pe alta ruta.");
	
		}
	}
}
