package factory.method.clase;

public class FactoryInfirmier implements Factory {
	
	@Override
	public PersonalSpital createPersonal(String nume) {
		return new Infirmier(nume);
	}
}
