package dubluri;

import clase.IPersoana;

public class StubPersoanaVarstnica implements IPersoana{

	@Override
	public String getSex() {
		return null;
	}

	@Override
	public int getVarsta() {
		return 70;
	}

	@Override
	public boolean checkCNP() {
		return false;
	}

}