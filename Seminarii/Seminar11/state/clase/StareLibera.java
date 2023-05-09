package state.clase;

public class StareLibera implements Stare{

	@Override
	public void schimbareStare(Masa masa) {
		if(!(masa.getStare() instanceof StareLibera)) {
			masa.setStare(this);
			System.out.println("Masa " + masa.getNrRezervare() + " este eliberata in acest moment.");
		}
		else {
			System.out.println("Masa este deja libera");
		}
	}

}