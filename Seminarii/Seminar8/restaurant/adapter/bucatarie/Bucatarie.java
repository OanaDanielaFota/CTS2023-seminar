package restaurant.adapter.bucatarie;

public class Bucatarie implements ISoftBucatarie{
	private String numeBucatar;
	
	

	public Bucatarie(String numeBucatar) {
		super();
		this.numeBucatar = numeBucatar;
	}



	@Override
	public void printeazaNota(double totalPlata) {
		System.out.println("Bucatar: " + this.numeBucatar);
		System.out.println("Nota dumneavoastra de plata este in valoare de " + totalPlata + " lei.");
		
	}

}