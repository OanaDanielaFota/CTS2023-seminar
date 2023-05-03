package chain.clase;

public class Client {
	private String nume;
	private String numarTelefon;
	private String adresaMain;
	
	public Client(String nume, String numarTelefon, String adresaMain) {
		super();
		this.nume = nume;
		this.numarTelefon = numarTelefon;
		this.adresaMain = adresaMain;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getNumarTelefon() {
		return numarTelefon;
	}

	public void setNumarTelefon(String numarTelefon) {
		this.numarTelefon = numarTelefon;
	}

	public String getAdresaMain() {
		return adresaMain;
	}

	public void setAdresaMain(String adresaMain) {
		this.adresaMain = adresaMain;
	}

	@Override
	public String toString() {
		return "Client [nume=" + nume + ", numarTelefon=" + numarTelefon + ", adresaMain=" + adresaMain + "]";
	}
	
	

}