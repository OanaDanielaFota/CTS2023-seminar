package command.clase;

public class Autobuz implements Automobil {
	
	private int numar;

	public Autobuz(int numar) {
		this.numar = numar;
	}
	
	public void plecareInCursa(int numarLinie) {
		System.out.println("Autobuzul cu numarul " + this.numar + " a plecat in cursa pe linia " + numarLinie);
	}

}
