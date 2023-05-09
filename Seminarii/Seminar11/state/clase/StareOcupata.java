package state.clase;

public class StareOcupata implements  Stare {

	@Override
	public void schimbareStare(Masa masa) {
		if(!(masa.getStare() instanceof StareOcupata)) {
			masa.setStare(this);
			System.out.println("Masa " + masa.getNrRezervare() + " este ocupata in acest moment.");
		}
		else {
			System.out.println("Masa nu poate fi ocupata");
		}
		
	}

}