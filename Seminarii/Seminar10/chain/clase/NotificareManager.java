package chain.clase;

public class NotificareManager extends Notificator{

	
	@Override
	public void notificaClient(String mesaj, Client client) {
		System.out.println("Cleintul " + client.getNume() + " nu primeste notificare.");
		
	}
	
	

}