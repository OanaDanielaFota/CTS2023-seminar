package chain.clase;

public class NotificareTelefon extends Notificator{



	@Override
	public void notificaClient(String mesaj, Client client) {
		if(client.getNumarTelefon()!=null) {
			System.out.println("Clientul " + client.getNume() + " primeste SMS cu mesajul " + mesaj);
		}
		else {
			if(super.getSuccesor()!=null) {
				super.getSuccesor().notificaClient(mesaj, client);
			}
			else {
				System.out.println("Clientul " + client.getNume() + " nu a putut fi notificat.");
			}
			
		}
			
	}

}