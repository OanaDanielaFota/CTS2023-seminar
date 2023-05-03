package strategy.main;

import strategy.clase.Client;
import strategy.clase.PlataCard;
import strategy.clase.PlataCash;


public class Main {
	public static void main(String[] args) {
		Client client = new Client("Andrei");
		client.realizeazaPlata(200.0);
		client.setModPlata(new PlataCard());
		
		client.realizeazaPlata(356.0);
		client.setModPlata(new PlataCash());
		client.realizeazaPlata(1000.0);
	}

}