package dubluri;

import clase.IPachetTuristic;
import clase.IPersoana;

public class FakePachetTuristic implements IPachetTuristic{
	private double pret;
	private String destinatie;

	@Override
	public Double getPret() {
		return pret;
	}

	@Override
	public IPersoana getClient() {
		return null;
	}

	@Override
	public boolean poateRezerva() {
		return false;
	}

	@Override
	public String getDestinatie() {
		return destinatie;
	}

	@Override
	public void aplicaDiscountVarstnici(int procent) {
		
	}

	@Override
	public void setClient(IPersoana client) {
		
	}

	@Override
	public void setDestinatie(String destinatie) {
		this.destinatie = destinatie;
		
	}

	@Override
	public void setPret(Double pret) {
		this.pret = pret;
		
	}

}