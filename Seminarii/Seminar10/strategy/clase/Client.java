package strategy.clase;

public class Client {
	private String numeClient;
	private ModPlata modPlata;
	
	
	public Client(String numeClient) {
		super();
		this.numeClient = numeClient;
		this.modPlata = new PlataCard();
	}

	public ModPlata getModPlata() {
		return modPlata;
	}


	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}

	public void realizeazaPlata(Double sumaPlata) {
		modPlata.plateste(this.numeClient, sumaPlata);
	}

}