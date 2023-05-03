package composite.main;

import composite.clase.Item;
import composite.clase.Produs;
import composite.clase.Sectiune;

//meniul contine sectiuni: startere, bauturi etc

public class Main {
	public static void main(String[] args) {
		
		//Sectiune
		Item sectiuneBauturi = new Sectiune("Bauturi");
		Item sectiuneStartere = new Sectiune("Startere");
		Item meniu = new Sectiune("Meniu");
		
		
		//Subsectiune
		Item subsectiuneCafele = new Sectiune("Cafele");
		Item subsectiuneSucuri = new Sectiune("Sucuri");
		
		
		//Produse
		Item produsCafeaNeagra = new Produs("Cafea neagra");
		Item produsCafeaLapte = new Produs("Cafea cu lapte");
		Item produsCocaCola = new Produs("Coca-Cola");
		Item produsPepsi = new Produs("Pepsi");
		Item produsApaPlata = new Produs("Apa plata");
		Item bruschete = new Produs("Bruschete");
		
		try {
			subsectiuneCafele.adaugareItem(produsCafeaNeagra);
			subsectiuneCafele.adaugareItem(produsCafeaLapte);
			
			subsectiuneSucuri.adaugareItem(produsCocaCola);
			subsectiuneSucuri.adaugareItem(produsPepsi);
			
			sectiuneBauturi.adaugareItem(subsectiuneCafele);
			sectiuneBauturi.adaugareItem(subsectiuneSucuri);
			sectiuneBauturi.adaugareItem(produsApaPlata);
			
			sectiuneStartere.adaugareItem(bruschete);
			
			meniu.adaugareItem(sectiuneBauturi);
			meniu.adaugareItem(sectiuneStartere);
			meniu.descriere("  ");
			
		}
		catch(Exception e) {
			
		}
	}

}