package dubluri;

import clase.IPersoana;

public class StubPersoana implements IPersoana{
	

	@Override
	public String getSex() {
		return "M";
	}

	@Override
	public int getVarsta() {
		return 23;
	}

	@Override
	public boolean checkCNP() {
		return true;
	}
	

}