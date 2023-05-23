package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.MyException;
import clase.Persoana;

public class PersoanaGetVarstaTest {

	@Test
	public void testGetVarstaRight() {
		Persoana persoana = new Persoana("Andrei", "6020408765432");
		assertEquals(21, persoana.getVarsta());
	}
	
	
	@Test
	public void getVarstaBoundary2000() {
		Persoana persoana = new Persoana("Liviu", "5000101876543");
		persoana.getVarsta();
	}
	
	@Test
	public void getVarstaBoundary1900() {
		Persoana persoana = new Persoana("Liviu", "1000101876543");
		persoana.getVarsta();
	}
	
	@Test
	public void getVarstaBoundary1999() {
		Persoana persoana = new Persoana("Liviu", "2990101876543");
		persoana.getVarsta();
	}
	
	@Test(expected = MyException.class)
	public void getVarstaException() {
		Persoana persoana = new Persoana("Liviu", "5230525876543");
		persoana.getVarsta();
	}
	
	@Test(timeout = 100)
	public void getVarstaPerformance() {
		Persoana persoana = new Persoana("Liviu", "5220525876543");
		persoana.getVarsta();
	}
	
	

}
