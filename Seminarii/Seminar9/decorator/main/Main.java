package decorator.main;

import decorator.clase.Decorator;
import decorator.clase.DecoratorNotaDePlataLaMultiAni;
import decorator.clase.DecoratorNotaDePlataPasteFericit;
import decorator.clase.INotaDePlata;
import decorator.clase.NotaDePlata;


public class Main {
	public static void main(String[] args) {
		INotaDePlata notaPlata = new NotaDePlata("2023-04-25"); 
		INotaDePlata notaPlata2 = new NotaDePlata("2023-04-26");
		
		notaPlata.printeazaNotaDePlata(200);
		notaPlata2.printeazaNotaDePlata(170);
		System.out.println();
		
		Decorator notaDePlataPasteFericit = new DecoratorNotaDePlataPasteFericit(notaPlata2);
		notaDePlataPasteFericit.printeazaNotaDePlata(50);
		notaDePlataPasteFericit.printeazaFelicitare();
		
		
//		Decorator notaDePlataDeLaMultiAni = new DecoratorNotaDePlataLaMultiAni(notaPlata);
//		notaDePlataDeLaMultiAni.printeazaNotaDePlata(100);
//		notaDePlataDeLaMultiAni.printeazaFelicitare();
//		System.out.println();
		
		Decorator notaDePlataDeLaMultiAni = new DecoratorNotaDePlataLaMultiAni(notaDePlataPasteFericit);
		notaDePlataDeLaMultiAni.printeazaNotaDePlata(100);
		notaDePlataDeLaMultiAni.printeazaFelicitare();
		System.out.println();
		
	
		
	}

}