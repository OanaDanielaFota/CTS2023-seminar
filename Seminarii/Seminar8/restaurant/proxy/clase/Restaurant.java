package restaurant.proxy.clase;

public class Restaurant implements IRestaurant{
	private String numeRestaurant;
	
	

	public Restaurant(String numeRestaurant) {
		super();
		this.numeRestaurant = numeRestaurant;
	}



	@Override
	public void rezervaMasa(int nrPersoane) {
		System.out.println("Masa a fost rezervata pentru " + nrPersoane + " persoane la restaurantul " + this.numeRestaurant);
		
	}

}