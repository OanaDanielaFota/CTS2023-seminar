package chain.clase;

public abstract class Notificator {
	
	private Notificator succesor = null;

	public void setSuccesor(Notificator succesor) {
		this.succesor = succesor;
	}

	public Notificator getSuccesor() {
		return succesor;
	}

	public abstract void notificaClient(String mesaj, Client client);

}