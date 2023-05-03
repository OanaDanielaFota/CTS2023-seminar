package restaurant.adapter.bar;

public class Bar implements ISoftBar{
	private String denumire;
	
	

	public Bar(String denumire) {
		super();
		this.denumire = denumire;
	}

	@Override
	public void printeazaNotaBauturi(double totalPlata) {
		System.out.println("Barul " + this.denumire + " a emis o factura in valoare de " + totalPlata + " lei.");
		
	}

}