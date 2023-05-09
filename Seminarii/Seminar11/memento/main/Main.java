package memento.main;

import memento.clase.Autobuz;
import memento.clase.OperatorAutobuz;

public class Main {

	public static void main(String[] args) {

		Autobuz autobuz = new Autobuz("Vasile", 15, "Mercedes", 2000, 25);
		OperatorAutobuz operator = new OperatorAutobuz();
		operator.adaugaMemento(autobuz.creareMemento());
		System.out.println(autobuz.toString());
		autobuz.setNumeSofer("Ion");
		autobuz.setConsumMediu(17);
		System.out.println(autobuz.toString());
		autobuz.restaurareAutobuz(operator.getMemento(0));
		System.out.println(autobuz.toString());
	}

}
