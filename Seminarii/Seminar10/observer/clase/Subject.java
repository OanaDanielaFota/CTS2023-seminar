package observer.clase;

public interface Subject {
	
	void adaugaObserver(Observer observer);
	void stergeOnserver(Observer observer);
	void notificaObserver(String mesaj);

}
