package state.clase;

public class AutobuzInService implements IBusState{
	
public void schimbaStare(Autobuz autobuz) {
		
		if(autobuz.getStare() instanceof AutobuzLaCapatDeLinie) {
			System.out.println("Autobuzul " + autobuz.getPlacutaDeInmatriculare() + " este in service.");
			autobuz.setStare(this);
		} else {
			System.out.println("Autobuzul " + autobuz.getPlacutaDeInmatriculare() + " nu poate ajunge in service.");
	
		}
	}

}
