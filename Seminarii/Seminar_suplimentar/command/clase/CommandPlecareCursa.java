package command.clase;

public class CommandPlecareCursa implements ICommand {

	private int nrLinie;
	private Automobil automobil;
	
	
	public CommandPlecareCursa(int nrLinie, Automobil automobil) {
		super();
		this.nrLinie = nrLinie;
		this.automobil = automobil;
	}
	
	
	public void execute() {
		automobil.plecareInCursa(nrLinie);
	}
	
	
}
