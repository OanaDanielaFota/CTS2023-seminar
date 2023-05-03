package restaurant.proxy.clase;

public class ProxyRestaurant implements IRestaurant{
	private IRestaurant restaurant;
	
	

	public ProxyRestaurant(IRestaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}



	@Override
	public void rezervaMasa(int nrPersoane) {
		if(nrPersoane >= 4) {
			this.restaurant.rezervaMasa(nrPersoane);
		}
		else {
			System.out.println("Rezervarea nu a putut fi facuta");
		}
		
	}
	

}