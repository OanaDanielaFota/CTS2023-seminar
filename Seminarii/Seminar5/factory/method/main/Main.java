package factory.method.main;

import java.util.ArrayList;
import java.util.List;

import factory.method.clase.Factory;
import factory.method.clase.FactoryAsistent;
import factory.method.clase.FactoryInfirmier;
import factory.method.clase.FactoryMedic;
import factory.method.clase.Infirmier;
import factory.method.clase.PersonalSpital;



public class Main {
	public static void main(String[] args) {
		Factory factoryAsistent = new FactoryAsistent();
		Factory factoryMedici = new FactoryMedic();
		List<PersonalSpital> listaPersonal = new ArrayList<>();
		listaPersonal.add(factoryAsistent.createPersonal("Bogdan"));
		listaPersonal.add(factoryMedici.createPersonal("Alin"));
		listaPersonal.add(factoryAsistent.createPersonal("Adrian"));
			
		Factory factoryInfirmier = new FactoryInfirmier();
		Infirmier infirmier = (Infirmier)factoryInfirmier.createPersonal("Florin");
		infirmier.setAniVechime(14);
		listaPersonal.add(infirmier);
		for(PersonalSpital personal : listaPersonal) {
			personal.descriere();
		}
	}
}
