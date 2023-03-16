package cts.singleton;

public class Program {

	public static void main(String[] args) {
//		Rector rector = Rector.getInstanta("Vasile", 2, 50);
//		Rector rector2 = Rector.getInstanta("Ion", 1, 40);
//		System.out.println(rector);
//		System.out.println(rector2);
//		
//		Decan decan1 = Decan.getInstanta();
//		Decan decan2 = Decan.getInstanta();
//		decan2.setNume("Marian");
//		System.out.println(decan1.getNume());
//		System.out.println(decan2.getNume());
		
		
		Firma firma1 = Firma.getFirma("SC FIRMA SRL");
		Firma firma2 = Firma.getFirma("SC ALTA FIRMA SRL");
		Firma firma3 = Firma.getFirma("SC FIRMA SRL");
		
		firma1.setNrAngajati(10);
		firma2.setNrAngajati(15);
		firma3.setNrAngajati(30);
		
		System.out.println(firma1.toString());
		System.out.println(firma2.toString());
		System.out.println(firma3.toString());

	}

}
