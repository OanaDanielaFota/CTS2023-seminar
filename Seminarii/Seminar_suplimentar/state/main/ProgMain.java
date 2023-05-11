package state.main;

import state.clase.Autobuz;
import state.clase.IBusState;

public class ProgMain {

	public static void main(String[] args) {

		Autobuz autobuz = new Autobuz("B123BUS");
		autobuz.inService();
		autobuz.laCapatDeLinie();
		autobuz.pleacaInCursa();
		autobuz.inService();
		autobuz.laCapatDeLinie();
		
		
	}

}
