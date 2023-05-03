package facade.main;

import facade.clase.Facade;


public class Main {
	public static void main(String[] args) {
		Facade facade = new Facade();
		System.out.println(facade.verificareMasa(10));
		System.out.println(facade.verificareMasa(5));
		System.out.println(facade.verificareMasa(2));
	}

}