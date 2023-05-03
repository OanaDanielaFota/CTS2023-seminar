package facade.clase;

public class Facade {
	MeseRestaurant listaMese;
	Ospatar ospatar;
	
	
	public Facade() {
		super();
		listaMese = new MeseRestaurant();
		listaMese.adaugaMasa(new Masa(true, 5, true));
		listaMese.adaugaMasa(new Masa(false, 2, false));
		listaMese.adaugaMasa(new Masa(true, 10, false));
		ospatar = new Ospatar();
		ospatar.debaraseazaMasa(2);
		ospatar.debaraseazaMasa(5);
	}



	@Override
	public String toString() {
		return "Facade [listaMese=" + listaMese + "]";
	}



	public String verificareMasa(int nrMasa) {
		if(listaMese.esteLibera(nrMasa)) {
			if(listaMese.areServetele(nrMasa) && ospatar.esteMasaDebarasata(nrMasa)) {
				return "Masa este libera si puteti lua loc";
			}
			else {
				return "Masa este libera, dar trebuie debarasata";
			}
		}
		else
		{
			return "Masa nu este libera";
		}
	}
}