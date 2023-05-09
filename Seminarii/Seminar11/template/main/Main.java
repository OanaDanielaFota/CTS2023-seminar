package template.main;

import template.clase.MasaLocala;
import template.clase.MasaRestaurant;
import template.clase.MasaRezervata;

public class Main {

	public static void main(String[] args) {
		
		MasaRestaurant masa = new MasaLocala(5);
		masa.ocupaMasa();
		MasaRestaurant masa2 = new MasaRezervata(4,"16:30");
		masa2.ocupaMasa();
		
		
	}
}
