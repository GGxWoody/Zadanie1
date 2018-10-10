public class Main {

    public static void main(String[] args) {
        Pracownik[] tab = new Pracownik[4];
        tab[0] = new Mechanik("ABC", "CBA", 33);
        tab[1] = new Nauczyciel("QWE", "EWQ", 27);
        tab[2] = new Murarz("RTY", "YTR", 21);
        tab[3] = new Piekarz("GHJ", "JHG", 65);
        for (int i = 0; i < 4; i++) {
            System.out.println(tab[i].pokazDane());
        }
    }
}
