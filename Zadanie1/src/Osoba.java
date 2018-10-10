public abstract class Osoba {
    private int wiek;
    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko, int wiek) {
        setImie(imie);
        setNazwisko(nazwisko);
        setWiek(wiek);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if (imie == null) {
            this.imie = "";
        } else {
            this.imie = imie;
        }
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if (nazwisko == null) {
            this.nazwisko = "";
        } else {
            this.nazwisko = nazwisko;
        }
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if (wiek <= 0) {
            this.wiek = 0;
        } else {
            this.wiek = wiek;
        }
    }

    public String pokazDane() {
        return "Osoba{" +
                "wiek=" + wiek +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    public abstract String Mow();
}
