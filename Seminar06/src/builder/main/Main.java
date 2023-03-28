package builder.main;

import builder.Pacient;
import builder.PacientBuilder;

public class Main {
	
	public static void main(String[] args) {
		PacientBuilder pacientBuilder = new PacientBuilder("Andrei");
		Pacient pacient = pacientBuilder.setMicDejunInclus(true).setPatRabatabil(true).build();
		Pacient pacientNou = new PacientBuilder("Maria").build();
		Pacient pacientNou2 = new PacientBuilder("Vasile").setMicDejunInclus(false).setPatRabatabil(false).build();
		Pacient pacientNou3 = pacientBuilder.setPatRabatabil(true).build();
		
		System.out.println(pacient.toString());
		System.out.println(pacientNou.toString());
		System.out.println(pacientNou2.toString());
		System.out.println(pacientNou3.toString());
		
		//pacient.setMicDejunInclud(false);
	}

}
