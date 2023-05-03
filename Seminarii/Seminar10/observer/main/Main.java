package observer.main;

import observer.clase.ClientRestaurant;
import observer.clase.Observer;
import observer.clase.Restaurant;

public class Main {
	public static void main(String[] args) {
		Restaurant restaurant =  new Restaurant("Los Amantes");
		
		Observer client1 = new ClientRestaurant("Vlad");
		Observer client2 = new ClientRestaurant("Maria");
		Observer client3 = new ClientRestaurant("Ion");
		
		restaurant.adaugaObserver(client1);
		restaurant.adaugaObserver(client2);
		
		restaurant.notificaOfertaPret();
		
		restaurant.adaugaObserver(client3);
		restaurant.notificaOfertaMeniu();
	}
}