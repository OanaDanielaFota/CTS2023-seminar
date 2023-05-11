package strategy.clase;

public class PlataPrinSMS implements ITipPlata{
    @Override
    public void plateste(double pretBilet) {
        System.out.println("Plata in valoare de " + pretBilet + " a fost efectuata prin SMS.");
    }
}