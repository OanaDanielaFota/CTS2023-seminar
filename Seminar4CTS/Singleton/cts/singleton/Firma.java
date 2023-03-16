package cts.singleton;

import java.util.HashMap;
import java.util.Map;

public class Firma {
	private String nume;
	private int nrAngajati;
	private static Map<String, Firma> registru = new HashMap<>();
	
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getNrAngajati() {
		return nrAngajati;
	}
	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}
	
	private Firma(String nume, int nrAngajati) {
		super();
		this.nume = nume;
		this.nrAngajati = nrAngajati;
	}
	
	
	public static Firma getFirma(String nume) {
		if(registru.containsKey(nume)) {
			return registru.get(nume);
		} else {
			Firma firma = new Firma(nume, 0);
			registru.put(nume, firma);
			return firma;
		}
	}
	@Override
	public String toString() {
		return "Firma [nume=" + nume + ", nrAngajati=" + nrAngajati + "]";
	}
	
	
	
	

}
