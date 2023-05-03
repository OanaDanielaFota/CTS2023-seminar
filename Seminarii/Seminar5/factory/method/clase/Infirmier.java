package factory.method.clase;


public class Infirmier implements PersonalSpital{
	private String nume;
	private int aniVechime;
	
	public Infirmier(String nume, int anVechime) {
		super();
		this.nume = nume;
		this.aniVechime = anVechime;
	}
	
	public Infirmier(String nume) {
		super();
		this.nume = nume;
		this.aniVechime = 0;
	}

	public int getAniVechime() {
		return aniVechime;
	}

	public void setAniVechime(int aniVechime) {
		this.aniVechime = aniVechime;
	}

	@Override
	public void descriere() {
		System.out.println("Infirmierul " + this.nume + " are " + this.aniVechime + " ani vechime");
	}
}
