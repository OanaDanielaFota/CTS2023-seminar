package cts.singleton.register;

import java.util.HashMap;
import java.util.Map;

public class Registru {
	private static Map<String, Firma> registru = new HashMap<String, Firma>();
	
	public Firma getFirma(String nume) {
		if(!registru.containsKey(nume)) {
			Firma firma = new Firma(nume, 0);
			registru.put(nume, firma);
		}
		return registru.get(nume);
			
		
	}

}
