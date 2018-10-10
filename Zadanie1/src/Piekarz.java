public class Piekarz extends Pracownik {
    public Piekarz(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek, "Piekarz");
    }

    @Override
    public String WykonajPrace() {
        return " Pieke chleb";
    }

    @Override
    public String Mow() {
        return " Po włosku";
    }
}
