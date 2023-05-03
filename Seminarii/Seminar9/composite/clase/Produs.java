package composite.clase;

public class Produs implements Item{
	private String nume;

	public Produs(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void adaugareItem(Item item) throws Exception {
		throw new Exception("adaugareItem nu este implementata");
		
	}

	@Override
	public void stergereItem(Item item) throws Exception {
		throw new Exception("stergereItem nu este implementata");
		
	}

	@Override
	public void descriere(String spatiere) {
		System.out.println(spatiere + this.nume);
		
	}

	@Override
	public Item getItem(int index) throws Exception {
		throw new Exception("getItem nu este implementata");
	}
	
	

}