package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import clase.AgentieTurism;
import clase.IPachetTuristic;
import dubluri.FakePachetTuristic;

public class AgentieTurismTest {

	@Tag("tag1")
	@Test
	void calculareSumaTotalaPacheteTest() {
		AgentieTurism agentie = new AgentieTurism();
		IPachetTuristic pachet = new FakePachetTuristic();
		IPachetTuristic pachet2 = new FakePachetTuristic();
		IPachetTuristic pachet3 = new FakePachetTuristic();
		pachet.setPret(200.0);
		pachet2.setPret(100.0);
		pachet3.setPret(500.0);
		agentie.adaugaPachet(pachet);
		agentie.adaugaPachet(pachet2);
		agentie.adaugaPachet(pachet3);
		assertEquals(800.0, agentie.calculareSumaTotalaPachete());
		
	}
	
	

}