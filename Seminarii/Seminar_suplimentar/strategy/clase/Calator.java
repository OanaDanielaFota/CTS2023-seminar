package strategy.clase;

public class Calator {
    private String nume;
    private ITipPlata tipPlata;

    public Calator(String nume) {
        this.nume = nume;
        this.tipPlata = new PlataCardCalatorii();
    }

    public ITipPlata getTipPlata() {
        return tipPlata;
    }

    public void setTipPlata(ITipPlata tipPlata) {
        this.tipPlata = tipPlata;
    }

    public void platesteBilet(double tarifBilet){
        this.tipPlata.plateste(tarifBilet);
    }
}