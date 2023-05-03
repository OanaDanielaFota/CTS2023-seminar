package facade.clase;

import java.util.HashMap;

public class MeseRestaurant {
	private HashMap<Integer, Masa> listaMese;
	
	public MeseRestaurant() {
		listaMese = new HashMap<Integer, Masa>();
	}
	
	public void adaugaMasa(Masa masa){
		listaMese.put(masa.getNrMasa(), masa);
	}
	
	public Boolean esteLibera(int nrMasa) {
		return listaMese.get(nrMasa).getMasaLibera();
	}
	
	public Boolean areServetele(int nrMasa) {
		return listaMese.get(nrMasa).getAreServetele();
	}

}