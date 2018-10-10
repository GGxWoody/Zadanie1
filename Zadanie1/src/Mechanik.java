public class Mechanik extends Pracownik {
    public Mechanik(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek, "Mechanik");
    }

    @Override
    public String WykonajPrace() {
        return " Naprawiam Auto";
    }

    @Override
    public String Mow() {
        return " Po polsku i angielsku";
    }
}
