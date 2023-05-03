package restaurant.adapter.bucatarie;

import restaurant.adapter.bar.ISoftBar;

public class AdapterBucatarieObiecte implements ISoftBucatarie{
	private ISoftBar bar;

	public AdapterBucatarieObiecte(ISoftBar bar) {
		super();
		this.bar = bar;
	}

	@Override
	public void printeazaNota(double totalPlata) {
		this.bar.printeazaNotaBauturi(totalPlata);
		
	}
	
	

}