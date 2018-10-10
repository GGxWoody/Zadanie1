public abstract class Pracownik extends Osoba {
    private String zawod;

    public Pracownik(String imie, String nazwisko, int wiek, String zawod) {
        super(imie, nazwisko, wiek);
        setZawod(zawod);
    }

    public abstract String WykonajPrace();

    public String getZawod() {
        return zawod;
    }

    public void setZawod(String zawod) {
        if (zawod == null) {
            this.zawod = "";
        } else {
            this.zawod = zawod;
        }
    }

    @Override
    public String pokazDane() {
        return super.pokazDane() + " zawod = " + zawod + this.Mow() + this.WykonajPrace();
    }
}
