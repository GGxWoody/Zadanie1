public class Murarz extends Pracownik {
    public Murarz(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek, "Murarz");
    }

    @Override
    public String Mow() {
        return " Po polsku";
    }

    @Override
    public String WykonajPrace() {
        return " Muruje ściane";
    }
}
