package memento.clase;

public class Autobuz {
	
	private String numeSofer;
	private float consumMediu;
	private String model;
	private int anFabricatie;
	private int nrLocuri;
	
	
	public Autobuz(String numeSofer, float consumMediu, String model, int anFabricatie, int nrLocuri) {
		super();
		this.numeSofer = numeSofer;
		this.consumMediu = consumMediu;
		this.model = model;
		this.anFabricatie = anFabricatie;
		this.nrLocuri = nrLocuri;
	}
	
	
	
	
	public String getNumeSofer() {
		return numeSofer;
	}




	public void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}




	public float getConsumMediu() {
		return consumMediu;
	}




	public void setConsumMediu(float consumMediu) {
		this.consumMediu = consumMediu;
	}




	public String getModel() {
		return model;
	}




	public void setModel(String model) {
		this.model = model;
	}




	public int getAnFabricatie() {
		return anFabricatie;
	}




	public void setAnFabricatie(int anFabricatie) {
		this.anFabricatie = anFabricatie;
	}




	public int getNrLocuri() {
		return nrLocuri;
	}




	public void setNrLocuri(int nrLocuri) {
		this.nrLocuri = nrLocuri;
	}




	public void restaurareAutobuz(AutobuzMemento memento) {
		
		this.numeSofer = memento.getNumeSofer();
		this.consumMediu = memento.getConsumMediu();
	}
	
	public AutobuzMemento creareMemento() {
		AutobuzMemento memento = new AutobuzMemento(this.numeSofer, this.consumMediu);
		return memento;
	}




	@Override
	public String toString() {
		return "Autobuz [numeSofer=" + numeSofer + ", consumMediu=" + consumMediu + ", model=" + model
				+ ", anFabricatie=" + anFabricatie + ", nrLocuri=" + nrLocuri + "]";
	}
		
	

}
