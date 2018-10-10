public class Nauczyciel extends Pracownik {
    public Nauczyciel(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek, "Nauczyciel");
    }

    @Override
    public String WykonajPrace() {
        return " Uczę";
    }

    @Override
    public String Mow() {
        return " Po polsku, angielsku i niemiecku";
    }
}
