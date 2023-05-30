package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import clase.IPersoana;
import clase.PachetTuristic;
import dubluri.StubPersoana;
import dubluri.StubPersoanaVarstnica;

public class PachetTuristicTest {

	@Tag("tag2")
	@Test
	void testAplicaDiscountVarstniciNuAplicaDiscount() {
		IPersoana iPersoana = (IPersoana) new StubPersoana();
		PachetTuristic pachet = new PachetTuristic(iPersoana, "Bucuresti", 10.0);
		
		pachet.aplicaDiscountVarstnici(20);
		assertEquals(10.0, pachet.getPret());
	}
	
	@Test
	void testAplicaDiscountVarstniciAplicaDiscount() {
		IPersoana iPersoana = (IPersoana) new StubPersoanaVarstnica();
		PachetTuristic pachet = new PachetTuristic(iPersoana, "Bucuresti", 10.0);
		
		pachet.aplicaDiscountVarstnici(20);
		assertEquals(8.0, pachet.getPret());
	}
	
	

}