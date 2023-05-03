package restaurant.proxy.main;

import restaurant.proxy.clase.IRestaurant;
import restaurant.proxy.clase.ProxyRestaurant;
import restaurant.proxy.clase.Restaurant;




public class Main {
	public static void main(String[] args) {
		IRestaurant restaurant = new Restaurant("Los Amantes");
		restaurant.rezervaMasa(9);
		restaurant.rezervaMasa(2);
		
		System.out.println("\n");
		System.out.println("Cu proxy:");
		IRestaurant proxy = new ProxyRestaurant(new Restaurant("Le Bab Bucharest")); 
		proxy.rezervaMasa(2);
		proxy.rezervaMasa(9);
	}

}