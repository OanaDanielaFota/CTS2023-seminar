package decorator.clase;

public class NotaDePlata implements INotaDePlata{
	String dataEmiterii;
	
	

	public NotaDePlata(String dataEmiterii) {
		super();
		this.dataEmiterii = dataEmiterii;
	}



	@Override
	public void printeazaNotaDePlata(int totalPlata) {
		System.out.println("Nota dumneavoastra de plata din " + this.dataEmiterii + " este in valoare de " + totalPlata + " lei.");
		
	}

}