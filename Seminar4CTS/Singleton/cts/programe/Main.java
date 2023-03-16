package cts.programe;

import cts.singleton.register.Firma;
import cts.singleton.register.Registru;

public class Main {
	public static void main(String[] args) {
		
		Registru registru = new Registru();
		Registru registruNou = new Registru();
		
		
		Firma firma1 = registru.getFirma("SC nume1 SRL");
		Firma firma2 = registru.getFirma("SC nume2 SRL");
		Firma firma3 = registruNou.getFirma("SC nume1 SRL");
		
		//Firma firma4 = new Firma("SC nume1 SRL", 0);
		
		firma1.angajeaza();
		firma2.angajeaza();
		firma3.angajeaza();
		
		System.out.println(firma1.toString());
		System.out.println(firma2.toString());
		System.out.println(firma3.toString());


		
	}
	

}

//main in alt pachet sa vedem daca are sau nu acces