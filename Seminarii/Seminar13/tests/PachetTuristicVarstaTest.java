package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import clase.IPersoana;
import clase.PachetTuristic;
import dubluri.FakePersoana;

public class PachetTuristicVarstaTest {

	@Tag("tag1")
	@Test
	void unTanarnuPoateRezerva() {
		FakePersoana persoana = new FakePersoana();
		persoana.setVarsta(16);
		PachetTuristic pachet = new PachetTuristic(persoana, "Cluj", 200.0);
		assertFalse(pachet.poateRezerva());
	}
	
	@Test
	void unAdultPoateRezerva() {
		FakePersoana persoana = new FakePersoana();
		persoana.setVarsta(50);
		PachetTuristic pachet = new PachetTuristic(persoana, "Cluj", 200.0);
		assertTrue(pachet.poateRezerva());
	}
	
	

}