package restaurant.adapter.bucatarie;

import restaurant.adapter.bar.Bar;

public class AdapterBucatarieClase extends Bar implements ISoftBucatarie{

	public AdapterBucatarieClase(String denumire) {
		super(denumire);
	}

	@Override
	public void printeazaNota(double totalPlata) {
		printeazaNotaBauturi(totalPlata);
		
	}
	
	

}