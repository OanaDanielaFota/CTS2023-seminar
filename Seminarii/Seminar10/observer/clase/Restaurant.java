package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subject{
	private String nume;
	private List<Observer> clientiAbonati;
	
	
	

	public Restaurant(String nume) {
		super();
		this.nume = nume;
		this.clientiAbonati = new ArrayList<>();
	}

	@Override
	public void adaugaObserver(Observer observer) {
		clientiAbonati.add(observer);
		
	}

	@Override
	public void stergeOnserver(Observer observer) {
		clientiAbonati.remove(observer);
		
	}

	@Override
	public void notificaObserver(String mesaj) {
		for(Observer client: clientiAbonati) {
			client.receptioneazaNotificare(mesaj);
		}
		
	}
	
	public void notificaOfertaPret() {
		this.notificaObserver(this.nume + " : Sunt reduceri de pret la shaorma");
	}
	
	public void notificaOfertaMeniu() {
		this.notificaObserver(this.nume + " : Avem produse noi la fructe de mare");
	}
	

}