package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.MyException;
import clase.Persoana;

public class PersoanaGetSexTest {

	@Test
	public void testGetRightSexMasculin() {
		Persoana persoana = new Persoana("Liviu", "50253689765432");
		assertEquals("M", persoana.getSex());
	}
	
	@Test
	public void testGetRightSexFeminin() {
		Persoana persoana2 = new Persoana("Maria", "6019856432987");
		assertEquals("F", persoana2.getSex());
	}
	
	@Test
	public void testGetBoundarySexMasculin() {
		Persoana persoana = new Persoana("Liviu", "5025368976543");
		assertEquals("M", persoana.getSex());
	}
	
	@Test
	public void testGetCrossCheckSex() {
		Persoana persoana = new Persoana("Liviu", "10253689765432");
		assertEquals(verificaImpar(persoana.CNP), persoana.getSex());
		
	}
	
	public String verificaImpar(String CNP) {
		int n = Integer.parseInt(CNP.charAt(0)+"");
		if(n % 2 != 0 ) {
			return "M";
		}
		return "F";
	}
	
	@Test(expected = MyException.class)
	public void testGetSexError() {
		Persoana persoana = new Persoana("Vasile", "9765432198765");
		persoana.getSex();
	}
	
	@Test(timeout = 100)
	public void testGetSexPerformance() {
		Persoana persoana = new Persoana("Vasile", "565432198765");
		persoana.getSex();
	}
	
	
	

}