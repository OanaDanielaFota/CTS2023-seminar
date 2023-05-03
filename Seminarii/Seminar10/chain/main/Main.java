package chain.main;

import chain.clase.Client;
import chain.clase.NotificareMail;
import chain.clase.NotificareManager;
import chain.clase.NotificareTelefon;
import chain.clase.Notificator;



public class Main {
	public static void main(String[] args) {
		Notificator notificatorTelefon = new NotificareTelefon();
		Notificator notificatorMail = new NotificareMail();
		Notificator notificatorManager  = new NotificareManager();
		
		notificatorTelefon.setSuccesor(notificatorMail);
		notificatorMail.setSuccesor(notificatorManager);
		
		Client client1 = new Client("Oana", "0722294781", null);
		Client client2 = new Client("Daniela", null, null);
		Client client3 = new Client("Andra", null, "andra@gmail.com");
		Client client4 = new Client("Andrei", "0876543276", "andrei@gamil.com");
		notificatorTelefon.notificaClient("Ai primit o notificare", client1);
		notificatorTelefon.notificaClient("Ai primit o notificare", client2);
		notificatorTelefon.notificaClient("Ai primit o notificare", client3);
		notificatorTelefon.notificaClient("Ai primit o notificare", client4);
		}

}