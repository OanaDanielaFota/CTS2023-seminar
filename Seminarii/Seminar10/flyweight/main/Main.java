package flyweight.main;

import flyweight.clase.FabricaClienti;
import flyweight.clase.IClient;
import flyweight.clase.Rezervare;

public class Main {
	public static void main(String[] args) {
		FabricaClienti fabricaClienti = new FabricaClienti();
		Rezervare rezervare1 = new Rezervare(1, 1, 2, 16);
		Rezervare rezervare2 = new Rezervare(2, 2, 4, 14);
		Rezervare rezervare3 = new Rezervare(3, 1, 2, 18);
		Rezervare rezervare4 = new Rezervare(4, 3, 1, 12);
		
		IClient client = fabricaClienti.getClient("Oana");
		client.descrieDetaliiRezervare(rezervare1);
		
		IClient client2 = fabricaClienti.getClient("Adrian");
		client2.descrieDetaliiRezervare(rezervare2);
		
		fabricaClienti.getClient("Oana").descrieDetaliiRezervare(rezervare3);
		fabricaClienti.getClient("Adrian").descrieDetaliiRezervare(rezervare4);
	}
}